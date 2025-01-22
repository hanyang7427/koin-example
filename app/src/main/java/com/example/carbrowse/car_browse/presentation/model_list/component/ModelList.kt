package com.example.carbrowse.car_browse.presentation.model_list.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ModelList(
    models: List<String>
) {

    val scroll =  rememberLazyListState()

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        state = scroll,
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(items = models) { model ->
            BookListItem(
                model = model
            )
        }
    }
}