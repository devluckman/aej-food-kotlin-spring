package com.man.food.repository

import com.man.food.database.DatabaseComponent
import com.man.food.entity.FoodEntity
import com.mongodb.client.MongoCollection
import org.litote.kmongo.eq
import org.litote.kmongo.findOne
import org.litote.kmongo.getCollection
import org.litote.kmongo.setValue
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class FoodRepositoryImpl : FoodRepository {

    @Autowired
    private lateinit var databaseComponent: DatabaseComponent

    private fun foodCollection(): MongoCollection<FoodEntity> =
            databaseComponent.database.getDatabase("food").getCollection()

    override fun getFoodById(id: String): FoodEntity? {
        return foodCollection().findOne(FoodEntity::id eq id)
    }

    override fun getFoods(): List<FoodEntity> {
        return foodCollection().find().toList()
    }

    override fun addFood(food: FoodEntity): List<FoodEntity> {
        val insert = foodCollection().insertOne(food)
        return if (insert.wasAcknowledged()){
            getFoods()
        }else throw IllegalArgumentException("Insert failed")
    }

    override fun delete(id: String): List<FoodEntity> {
        val deleteAction = foodCollection().deleteOne(FoodEntity::id eq id)
        return if (deleteAction.wasAcknowledged()){
            getFoods()
        }else throw IllegalArgumentException("Delete failed")
    }

    override fun updateFood(food: FoodEntity): List<FoodEntity> {
        val updateAction = foodCollection().updateOne(FoodEntity::id eq food.id, setValue(FoodEntity::name, food.name))
        return if (updateAction.wasAcknowledged()){
            getFoods()
        }else throw IllegalArgumentException("Update failed")
    }

}