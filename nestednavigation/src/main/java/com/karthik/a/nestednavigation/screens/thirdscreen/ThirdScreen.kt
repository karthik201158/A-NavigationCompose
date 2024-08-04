package com.karthik.a.nestednavigation.screens.thirdscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.karthik.a.nestednavigation.navigation.ScreenRoute


@Composable
fun ThirdScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Third screen")
        Button(onClick = {
            //false tells that it will remove all expect first screen
            navController.popBackStack(ScreenRoute.First.route, false)
        }) {
            Text("Go to first screen by clearing second screen instance")
        }
    }
}

