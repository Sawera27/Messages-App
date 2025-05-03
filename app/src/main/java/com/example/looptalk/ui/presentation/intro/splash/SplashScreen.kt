package com.example.looptalk.ui.presentation.intro.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.looptalk.R
import com.example.looptalk.app.utensils.Routes
import com.example.looptalk.ui.theme.Blue
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(Unit) {
        delay(3000)
        navController.navigate(Routes.OnBoardingScreen.name)
        {  popUpTo(Routes.SplashScreen.name)
        { inclusive = true }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF0874F0)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.message_logo), contentDescription = "")
    }
}