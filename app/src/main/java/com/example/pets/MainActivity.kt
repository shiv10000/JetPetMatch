package com.example.pets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.RememberObserver
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pets.Screens.FunFactsNavigationGraph
import com.example.pets.Screens.Routes
import com.example.pets.Screens.UserInputScreen
import com.example.pets.Screens.WelcomeScreen
import com.example.pets.ui.theme.PetsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    Funfactsapp()
                }
            }
        }

@Composable
fun  Funfactsapp(){

            FunFactsNavigationGraph()

         }

