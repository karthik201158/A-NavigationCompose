package com.karthik.a.navigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.karthik.a.navigationcompose.screens.firstscreen.firstScreenRoute
import com.karthik.a.navigationcompose.screens.secondscreen.secondScreenRoute
import com.karthik.a.navigationcompose.screens.thirdscreen.thirdScreenRoute


@Composable
fun MyNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = ScreenRoute.First.route) {

        // First Screen
        firstScreenRoute(navController = navController)
        secondScreenRoute(navController = navController)
        thirdScreenRoute(navController = navController)

    }
}