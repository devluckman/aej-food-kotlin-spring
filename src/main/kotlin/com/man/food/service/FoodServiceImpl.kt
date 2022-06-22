package com.man.food.service

import com.man.food.entity.FoodEntity
import com.man.food.repository.FoodRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FoodServiceImpl : FoodService {

    @Autowired
    private lateinit var repository: FoodRepository

    override fun getFoodById(id: String): FoodEntity? = repository.getFoodById(id)

    override fun getFoods(): List<FoodEntity> = repository.getFoods()

    override fun addFood(food: FoodEntity): List<FoodEntity> = repository.addFood(food)

    override fun delete(id: String): List<FoodEntity> = repository.delete(id)

    override fun updateFood(food: FoodEntity): List<FoodEntity> = repository.updateFood(food)

}