package com.example.carbrowse.car_browse.di

import com.example.carbrowse.car_browse.data.repository.ModelRepositoryImpl
import com.example.carbrowse.car_browse.domain.repository.ModelRepository
import com.example.carbrowse.car_browse.domain.use_case.GetModelUseCase
import com.example.carbrowse.car_browse.presentation.model_list.ModelListViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module


val carModule = module {
    single { GetModelUseCase(get()) }
    singleOf(::ModelRepositoryImpl).bind<ModelRepository>()
    viewModelOf(::ModelListViewModel)
}