package com.example.carbrowse.car_browse.presentation.model_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.carbrowse.car_browse.domain.Resource
import com.example.carbrowse.car_browse.domain.use_case.GetModelUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ModelListViewModel(
    private val getModelUseCase: GetModelUseCase
):ViewModel() {
    private val _state = MutableStateFlow(ModelListState())
    val state = _state.asStateFlow()

    init {
        getModel()
    }

    fun onAction(action: ModelListAction) {
        when (action) {
            else -> {}
        }
    }

    fun getModel() {
        viewModelScope.launch {
            getModelUseCase(brandId = "")
                .collect() { res->
                    when (res) {
                        is Resource.Loading -> {
                            _state.update { it.copy(isLoading = true) }
                        }
                        is Resource.Success -> {
                            _state.update { it.copy(models = res.data!!) }
                        }
                        is Resource.Error -> {
                            _state.update {
                                it.copy(
                                    models = emptyList(),
                                    errorMessage = res.message,
                                    isLoading = false
                                )
                            }
                        }
                    }
                }
        }
    }



}