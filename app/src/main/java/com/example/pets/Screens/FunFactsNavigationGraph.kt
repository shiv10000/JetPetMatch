package com.example.pets.Screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pets.ui.theme.UserInputViewModel

@Composable
fun FunFactsNavigationGraph(userInputViewModel: UserInputViewModel= viewModel()){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Routes.User_Input_Screen ) {

        composable(Routes.User_Input_Screen) {
            UserInputScreen(userInputViewModel)
        }
        composable(Routes.Welcome_Screen) {
            WelcomeScreen()
        }
    }}

