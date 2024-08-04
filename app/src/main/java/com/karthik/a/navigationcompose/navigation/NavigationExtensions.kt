package com.karthik.a.navigationcompose.navigation

import androidx.navigation.NavHostController


//Launching a single copy of destination
fun NavHostController.navigateSingleTopTo(route:String){
    this.navigate(route){
        launchSingleTop = true
    }
}
