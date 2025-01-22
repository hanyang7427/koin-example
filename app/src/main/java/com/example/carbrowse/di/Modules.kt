package com.example.carbrowse.di

import com.example.carbrowse.car_browse.data.remote.Api
import com.example.carbrowse.car_browse.data.remote.createRetrofit
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import com.example.carbrowse.car_browse.presentation.model_list.ModelListViewModel
import retrofit2.Retrofit

val module = module {
    single { createRetrofit() }
    single { get<Retrofit>().create(Api::class.java) }
}