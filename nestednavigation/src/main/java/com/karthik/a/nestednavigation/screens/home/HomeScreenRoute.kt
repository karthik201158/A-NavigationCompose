package com.karthik.a.nestednavigation.screens.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.karthik.a.nestednavigation.navigation.MainScreenRoute


fun NavGraphBuilder.homeScreenRoute(navController: NavController){
    composable(MainScreenRoute.Home.route){
        HomeScreen(navController = navController)
    }
}