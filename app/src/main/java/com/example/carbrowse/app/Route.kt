package com.example.carbrowse.app

import kotlinx.serialization.Serializable

sealed interface Route {

    @Serializable
    data object ModelList: Route

}