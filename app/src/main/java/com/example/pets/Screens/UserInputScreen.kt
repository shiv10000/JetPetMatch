package com.example.pets.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.pets.data.UserDataUiEvents
import com.example.pets.ui.theme.TextComponent
import com.example.pets.ui.theme.TextFieldComponent
import com.example.pets.ui.theme.TopBar
import com.example.pets.ui.theme.UserInputViewModel

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(18.dp)
        ){
            TopBar("Hi there")
            Spacer(modifier = Modifier.padding(10.dp))
            TextComponent(textValue ="Lets learn about you", TextUnit =24.sp )
            Spacer(modifier = Modifier.size(20.dp))
            TextComponent(textValue ="This app will prepare a details page based om input provided by you!", TextUnit =18.sp )
            Spacer(modifier = Modifier.size(60.dp))
            TextComponent(textValue = "Name", TextUnit = 18.sp)
            Spacer(modifier = Modifier.size(10.dp))
            TextFieldComponent(onTextChanged ={
                userInputViewModel.onEvent(
                    UserDataUiEvents.UserNameEntered(it)
                )

            }

            )
            Spacer(modifier = Modifier.size(20.dp))
            TextComponent(textValue = "What do you like", TextUnit = 18.sp)



        }

    }

}


















@Preview(showSystemUi = true)
@Composable
fun ShowUserInputScreen(){
    UserInputScreen(UserInputViewModel())
}