package com.example.carbrowse.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.carbrowse.car_browse.presentation.model_list.ModelListScreen

@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Route.ModelList
    ) {
        composable<Route.ModelList>() {
            ModelListScreen()
        }
    }
}