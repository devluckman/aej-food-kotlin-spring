package com.man.food.service

import com.man.food.entity.FoodEntity

interface FoodService {

    fun getFoodById(id : String) : FoodEntity?
    fun getFoods() : List<FoodEntity>
    fun addFood(food : FoodEntity): List<FoodEntity>
    fun delete(id : String): List<FoodEntity>
    fun updateFood(food: FoodEntity) : List<FoodEntity>

}