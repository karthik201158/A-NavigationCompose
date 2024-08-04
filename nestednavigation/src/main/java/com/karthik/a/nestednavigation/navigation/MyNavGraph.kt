package com.karthik.a.nestednavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost


@Composable
fun MyNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = ScreenRoute.First.route) {

    }
}