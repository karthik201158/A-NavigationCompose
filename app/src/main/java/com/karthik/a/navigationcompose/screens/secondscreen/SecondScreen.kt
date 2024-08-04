package com.karthik.a.navigationcompose.screens.secondscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.karthik.a.navigationcompose.screens.SharedViewModel
import com.karthik.a.navigationcompose.navigation.ScreenRoute
import com.karthik.a.navigationcompose.screens.firstscreen.FirstScreenViewModel


@Composable
fun SecondScreen(
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
        Column {
            Text("Second screen")
            Text(firstScreenData.value)
        }
        Button(onClick = {
            navController.navigate(ScreenRoute.Third.route)
        }) {
            Text("Go to third screen")
        }
    }
}

