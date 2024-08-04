package com.karthik.a.nestednavigation.screens.secondscreen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.karthik.a.nestednavigation.navigation.ScreenRoute
import com.karthik.a.nestednavigation.screens.secondscreen.SecondScreen


fun NavGraphBuilder.secondScreenRoute(navController: NavController){
    composable(ScreenRoute.Second.route){
        SecondScreen(navController = navController)
    }
}