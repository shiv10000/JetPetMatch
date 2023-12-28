package com.example.pets.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeScreen(){
    Surface(modifier = Modifier.fillMaxSize()) {
        Text(text = Routes.Welcome_Screen, modifier = Modifier
            .fillMaxWidth()
            .height(80.dp))

    }





}
@Preview
@Composable
fun ShowUserInputScreenWelcome(){
    WelcomeScreen()
 }