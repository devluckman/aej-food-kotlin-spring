package com.man.food.repository

import com.man.food.entity.FoodEntity

interface FoodRepository {

    fun getFoodById(id : String) : FoodEntity?
    fun getFoods() : List<FoodEntity>
    fun addFood(food : FoodEntity): List<FoodEntity>
    fun delete(id : String): List<FoodEntity>
    fun updateFood(food: FoodEntity) : List<FoodEntity>
    
}