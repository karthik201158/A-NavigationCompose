package com.karthik.a.nestednavigation.navigation.navgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.karthik.a.nestednavigation.screens.home.homeScreenRoute
import com.karthik.a.nestednavigation.screens.profile.profileScreenRoute


@Composable
fun MainNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "auth") {
        // Nesting the auth navigation graph
        authNavGraph(navController)

        homeScreenRoute(navController = navController)
        profileScreenRoute(navController = navController)
    }
}