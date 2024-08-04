package com.karthik.a.nestednavigation.screens.profile

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.karthik.a.nestednavigation.navigation.MainScreenRoute


fun NavGraphBuilder.profileScreenRoute(navController: NavController){
    composable(MainScreenRoute.Profile.route){
        ProfileScreen(navController = navController)
    }
}