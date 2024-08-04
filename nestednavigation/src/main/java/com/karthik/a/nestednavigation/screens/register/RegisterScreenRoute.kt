package com.karthik.a.nestednavigation.screens.register

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.karthik.a.nestednavigation.navigation.AuthScreenRoute


fun NavGraphBuilder.registerScreenRoute(navController: NavController){
    composable(AuthScreenRoute.Register.route){
        RegisterScreen(navController = navController)
    }
}