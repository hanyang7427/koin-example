package com.example.carbrowse.car_browse.domain

sealed class ApiResult<T>(val data: T? = null, val message: String="") {
    class Success<T>(message: String="",data: T) : ApiResult<T>(data,message)
    class Error<T>(message: String, data: T? = null) : ApiResult<T>(data, message)
}