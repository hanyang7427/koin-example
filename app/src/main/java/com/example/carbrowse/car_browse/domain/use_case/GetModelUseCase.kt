package com.example.carbrowse.car_browse.domain.use_case


import com.example.carbrowse.car_browse.domain.repository.ModelRepository
import com.example.carbrowse.car_browse.domain.ApiResult
import kotlinx.coroutines.flow.Flow
import com.example.carbrowse.car_browse.domain.Resource
import kotlinx.coroutines.flow.flow

class GetModelUseCase(
    private val modelRepository: ModelRepository
) {
    operator fun invoke(
        brandId:String,
    ):Flow<Resource<List<String>>> {
        return flow {
            emit(Resource.Loading(message = "loading models of ${brandId}"))
            val res = modelRepository.getModelOfBrand(brandId=brandId)
            when (res) {
                is ApiResult.Success -> {
                    if (res.data == null) {
                        emit(Resource.Error(message = "error"))
                    } else {
                        emit(Resource.Success(data = res.data))
                    }
                }
                is ApiResult.Error -> {
                    emit(Resource.Error(message = res.message))
                }
            }
        }
    }
}