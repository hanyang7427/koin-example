package com.example.carbrowse.car_browse.presentation.model_list

data class ModelListState(
    val models:List<String> = emptyList(),
    val isLoading:Boolean = false,
    val errorMessage:String = ""
)
