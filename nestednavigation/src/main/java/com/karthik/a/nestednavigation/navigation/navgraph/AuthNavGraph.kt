package com.karthik.a.nestednavigation.navigation.navgraph


import androidx.navigation.NavHostController
import com.karthik.a.nestednavigation.screens.forgotpassword.forgotPasswordScreenRoute
import com.karthik.a.nestednavigation.screens.login.loginScreenRoute
import com.karthik.a.nestednavigation.screens.register.registerScreenRoute
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.karthik.a.nestednavigation.navigation.AuthScreenRoute

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(startDestination = AuthScreenRoute.Login.route, route = "auth") {
        loginScreenRoute(navController = navController)
        forgotPasswordScreenRoute(navController = navController)
        registerScreenRoute(navController = navController)
    }
}