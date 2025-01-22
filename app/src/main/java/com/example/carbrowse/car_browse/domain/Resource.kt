package com.example.carbrowse.car_browse.domain

sealed class Resource<T>(val data: T?, val message: String="") {
    class Success<T>(message: String="",data: T) : Resource<T>(data,message)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T>(message: String,data: T? = null) : Resource<T>(data,message)
}