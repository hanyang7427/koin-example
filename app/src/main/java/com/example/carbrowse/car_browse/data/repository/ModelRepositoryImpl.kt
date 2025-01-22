package com.example.carbrowse.car_browse.data.repository

import com.example.carbrowse.car_browse.data.remote.Api
import com.example.carbrowse.car_browse.domain.repository.ModelRepository
import com.example.carbrowse.car_browse.domain.ApiResult

class ModelRepositoryImpl(
    private val api: Api
):ModelRepository {
    override suspend fun getModelOfBrand(brandId: String): ApiResult<List<String>> {
        try {
            val res = api.fetchModel(brandId=brandId)
            return ApiResult.Success(data = res)
        } catch (e:Exception) {
            return ApiResult.Error(message = e.message?:"unknown error")
        }
    }
}