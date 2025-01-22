package com.example.carbrowse.car_browse.domain.repository

import com.example.carbrowse.car_browse.domain.ApiResult

interface ModelRepository {
    suspend fun getModelOfBrand(brandId:String): ApiResult<List<String>>
}