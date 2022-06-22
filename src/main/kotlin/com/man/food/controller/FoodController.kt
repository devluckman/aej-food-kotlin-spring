package com.man.food.controller

import com.man.food.base.BaseResponse
import com.man.food.entity.FoodEntity
import com.man.food.service.FoodService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/v1/food")
class FoodController {

    @Autowired
    private lateinit var foodService: FoodService

    @GetMapping("/hello")
    fun helloWord(): BaseResponse<String> {
        return BaseResponse(
                data = "Hello, this is API Food"
        )
    }

    @GetMapping
    fun getFoods(): BaseResponse<List<FoodEntity>> =
            BaseResponse(
                    message = "Success",
                    data = foodService.getFoods()
            )

    @GetMapping("/{id}")
    fun getFoodById(
            @PathVariable(value = "id") foodId: String
    ): BaseResponse<FoodEntity?> {
        return BaseResponse(
                message = "Success",
                data = foodService.getFoodById(foodId)
        )
    }

    @DeleteMapping("/delete/{id}")
    fun deleteMovie(
            @PathVariable(value = "id") foodId: String
    ): BaseResponse<List<FoodEntity>> {
        return BaseResponse(
                message = "Success Delete Food",
                data = foodService.delete(foodId)
        )
    }

    @PostMapping
    fun addFood(
            @RequestBody foodEntity: FoodEntity
    ): BaseResponse<List<FoodEntity>> {
        return BaseResponse(
                message = "Success Add Movie",
                data = foodService.addFood(foodEntity)
        )
    }


    @PutMapping("/update")
    fun updateMovie(
            @RequestBody foodEntity: FoodEntity
    ): BaseResponse<List<FoodEntity>> {
        return BaseResponse(
                message = "Success Update Food",
                data = foodService.updateFood(foodEntity)
        )
    }
}