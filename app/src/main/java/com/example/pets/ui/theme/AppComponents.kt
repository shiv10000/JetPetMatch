package com.example.pets.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pets.R

@Composable
fun TopBar(value:String){
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Text(text = value,
            color = Color.Black,
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium


        )
        Spacer(modifier = Modifier.weight(1f))
        Image(
            modifier = Modifier.size(30.dp),

            painter = painterResource(id = R.drawable.fire) ,


            contentDescription = "Fire logo")




    }

}

@Composable
fun TextComponent(textValue:String,TextUnit:TextUnit,color:Color= Color.Black){
    Text(text = textValue,
        fontSize = TextUnit,
        color=color,
        fontWeight = FontWeight.Light

    )


}
@Composable
fun TextFieldComponent(
    onTextChanged:(name:String)->Unit
){
    var currentValue by remember {
        mutableStateOf("")
    }
    val localfocusmanager= LocalFocusManager.current
    OutlinedTextField(value =currentValue, onValueChange ={
        currentValue=it
    onTextChanged(it)



    },modifier= Modifier.fillMaxWidth(),
        placeholder = {
            Text(text = "Enter your name", fontSize = 18.sp)
        },
        textStyle = TextStyle.Default.copy(fontSize = 24.sp),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions{
            localfocusmanager.clearFocus()
        }


    )
}

@Preview
@Composable
fun TopBarView(){
 }