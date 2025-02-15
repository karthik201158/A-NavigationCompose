package com.karthik.a.nestednavigation.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.karthik.a.nestednavigation.navigation.AuthScreenRoute
import com.karthik.a.nestednavigation.navigation.MainScreenRoute


@Composable
fun HomeScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column {
            Text("Home screen")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
           navController.navigate(MainScreenRoute.Profile.route)
        }) {
            Text("Profile Screen")
        }
    }
}