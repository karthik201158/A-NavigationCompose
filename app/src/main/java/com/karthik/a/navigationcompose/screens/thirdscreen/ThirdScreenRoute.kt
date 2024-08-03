package com.karthik.a.navigationcompose.screens.thirdscreen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.karthik.a.navigationcompose.navigation.ScreenRoute


fun NavGraphBuilder.thirdScreenRoute(navController: NavController){
    composable(ScreenRoute.Third.route){
        ThirdScreen(navController = navController)
    }
}