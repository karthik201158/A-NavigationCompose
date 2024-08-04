package com.karthik.a.nestednavigation.screens.firstscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.karthik.a.nestednavigation.navigation.ScreenRoute
import androidx.lifecycle.viewmodel.compose.viewModel
import com.karthik.a.nestednavigation.screens.SharedViewModel


@Composable
fun FirstScreen(
    navController: NavController,
    viewModel: FirstScreenViewModel = viewModel(),
    sharedViewModel: SharedViewModel = hiltViewModel()
) {
    // Collect the data from the StateFlow
    val firstScreenData =  sharedViewModel.sharedData.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Update the data when the composable is first composed
        LaunchedEffect(Unit) {
            sharedViewModel.updateData("This is first screen data")
        }
        Column {
            Text("First screen")
            Text(firstScreenData.value)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navController.navigate(ScreenRoute.Second.route)
        }) {
            Text("Go to second screen")
        }
    }
}