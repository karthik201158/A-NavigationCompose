package com.karthik.a.nestednavigation.screens.forgotpassword

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.karthik.a.nestednavigation.navigation.AuthScreenRoute


fun NavGraphBuilder.forgotPasswordScreenRoute(navController: NavController){
    composable(AuthScreenRoute.ForgotPassword.route){
        ForgotPasswordScreen(navController = navController)
    }
}