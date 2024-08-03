package com.karthik.a.navigationcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.karthik.a.navigationcompose.navigation.MyNavGraph

//Starting point of Navigation
@Composable
fun MyNavigationApp() {
    val navController = rememberNavController()
    MyNavGraph(navController)
}