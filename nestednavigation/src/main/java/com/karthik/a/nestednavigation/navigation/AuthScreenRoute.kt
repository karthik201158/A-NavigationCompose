package com.karthik.a.nestednavigation.navigation


sealed class AuthScreenRoute(val route: String) {
    data object Login : AuthScreenRoute("login_route")
    data object ForgotPassword : AuthScreenRoute("forgotPassword_route")
    data object Register : AuthScreenRoute("register_route")
}

