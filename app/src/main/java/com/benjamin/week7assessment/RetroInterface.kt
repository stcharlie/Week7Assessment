package com.benjamin.week7assessment

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RetroInterface {
    @GET("items")
    suspend fun getAllItems():List<Items>

    @POST("students")
    suspend fun addStudentList(@Body post: Students):List<Students>
}