package com.karthik.a.navigationcompose.screens.firstscreen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.karthik.a.navigationcompose.navigation.ScreenRoute


fun NavGraphBuilder.firstScreenRoute(navController: NavController){
    composable(ScreenRoute.First.route){
        FirstScreen(navController = navController)
    }
}