package com.karthik.a.nestednavigation.screens.thirdscreen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.karthik.a.nestednavigation.navigation.ScreenRoute
import com.karthik.a.nestednavigation.screens.thirdscreen.ThirdScreen


fun NavGraphBuilder.thirdScreenRoute(navController: NavController){
    composable(ScreenRoute.Third.route){
        ThirdScreen(navController = navController)
    }
}