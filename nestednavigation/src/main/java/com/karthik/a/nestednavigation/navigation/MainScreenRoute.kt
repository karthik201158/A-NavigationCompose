package com.karthik.a.nestednavigation.navigation


sealed class MainScreenRoute(val route: String) {
    data object Home : MainScreenRoute("home_route")
    data object Profile : MainScreenRoute("profile_route")
}

