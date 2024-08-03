package com.karthik.a.navigationcompose.screens.secondscreen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.karthik.a.navigationcompose.navigation.ScreenRoute


fun NavGraphBuilder.secondScreenRoute(navController: NavController){
    composable(ScreenRoute.Second.route){
        SecondScreen(navController = navController)
    }
}