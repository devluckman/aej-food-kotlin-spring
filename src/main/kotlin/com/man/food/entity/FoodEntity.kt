package com.man.food.entity

import java.util.*

data class FoodEntity (
        var id: String = UUID.randomUUID().toString(),
        var name: String = ""
)