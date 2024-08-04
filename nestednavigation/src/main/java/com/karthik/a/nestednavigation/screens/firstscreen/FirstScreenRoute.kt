package com.karthik.a.nestednavigation.screens.firstscreen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.karthik.a.nestednavigation.navigation.ScreenRoute
import com.karthik.a.nestednavigation.screens.firstscreen.FirstScreen


fun NavGraphBuilder.firstScreenRoute(navController: NavController){
    composable(ScreenRoute.First.route){
        FirstScreen(navController = navController)
    }
}