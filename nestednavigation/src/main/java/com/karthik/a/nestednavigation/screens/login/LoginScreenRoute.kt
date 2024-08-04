package com.karthik.a.nestednavigation.screens.login

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.karthik.a.nestednavigation.navigation.AuthScreenRoute


fun NavGraphBuilder.loginScreenRoute(navController: NavController){
    composable(AuthScreenRoute.Login.route){
        LoginScreen(navController = navController)
    }
}