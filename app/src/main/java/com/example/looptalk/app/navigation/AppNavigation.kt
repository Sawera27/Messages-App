package com.example.looptalk.app.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.looptalk.app.utensils.Routes
import com.example.looptalk.ui.presentation.intro.onBoarding.OnBoardingScreen
import com.example.looptalk.ui.presentation.intro.splash.SplashScreen

@Composable
fun AppNavigation() {

    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = "") {
        composable(Routes.SplashScreen.name) {
            SplashScreen(navController = navController)
        }
        composable(Routes.OnBoardingScreen.name) {
            OnBoardingScreen(navController = navController)
        }
    }
}