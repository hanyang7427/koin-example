package com.example.carbrowse.car_browse.presentation.model_list

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.carbrowse.car_browse.presentation.model_list.component.ModelList
import org.koin.androidx.compose.koinViewModel

@Composable
fun ModelListScreen(
    viewModel: ModelListViewModel = koinViewModel(),   // viewmodel的生命周期和navBackStackEntry绑定
) {
    val state by viewModel.state.collectAsState()

    Row(
        modifier = Modifier.fillMaxSize(),
    ) {
        ModelList(models = state.models)
    }
}