package com.karthik.a.nestednavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.karthik.a.nestednavigation.navigation.navgraph.MainNavGraph


//Starting point of Navigation
@Composable
fun MyNavigationApp() {
    val navController = rememberNavController()
    MainNavGraph(navController)
}