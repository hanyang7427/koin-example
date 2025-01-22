package com.example.carbrowse.car_browse.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    // 测试接口
    @GET()
    suspend fun fetchModel(@Query("brandId") brandId: String): List<String>


}