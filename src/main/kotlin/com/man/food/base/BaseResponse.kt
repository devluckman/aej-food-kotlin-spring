package com.man.food.base

data class BaseResponse<T>(
        var status : Boolean = true,
        var message : String = "Success",
        var data : T? = null
)