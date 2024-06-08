package com.ncthuong.lab8_ph31749.BaiTap

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ncthuong.lab8_ph31749.Screen
import com.ncthuong.lab8_ph31749.ui.screens.MovieScreen
import com.ncthuong.lab8_ph31749.ui.screens.Screen1
import com.ncthuong.lab8_ph31749.ui.screens.Screen2
import com.ncthuong.lab8_ph31749.ui.screens.Screen3

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.LOGIN.route
    ) {
        composable(Screen.SCREEN1.route) {
            Screen1(navController = navController)
        }

        composable(Screen.SCREEN2.route) {
            Screen2(navController = navController)
        }

        composable(Screen.SCREEN3.route) {
            Screen3(navController = navController)
        }

        composable(Screen.LOGIN.route) {
            LoginSreen(navController = navController)
        }

        composable(Screen.MOVIE_SCREEN.route) {
            MovieScreen()
        }
    }
}