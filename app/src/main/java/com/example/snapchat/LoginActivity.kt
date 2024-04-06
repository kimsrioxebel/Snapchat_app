package com.example.snapchat

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.snapchat.ui.theme.SnapchatTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SnapchatTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    signin()
                }
            }
        }
    }
}
@Composable
fun signin() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var context = LocalContext.current


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.White)
    ) {
        Text(
            text = "Welcome To Snapchat",
            color = Color.Black,
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif
        )
        Spacer(
            modifier = Modifier
                .height(30.dp)
        )
        Spacer(
            modifier = Modifier
                .height(30.dp)
        )


        Text(
            text = "Enter email or Phone Number",
            color = Color.Blue,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif
        )






        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },

            label = { Text(text = " ") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()

        )

        Spacer(
            modifier = Modifier
                .height(30.dp)
        )



        Spacer(
            modifier = Modifier
                .height(30.dp)
        )

        Text(
            text = "Enter Password",
            color = Color.Blue,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Pass") },
            label = { Text(text = " ") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()

        )
        Spacer(
            modifier = Modifier
                .height(30.dp)
        )
        Spacer(
            modifier = Modifier
                .height(30.dp)
        )


        Text(
            text = "Forgotten Password?",
            color = Color.Red,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif
        )
        Spacer(
            modifier = Modifier
                .height(30.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, com.example.snapchat.DetailsActivity::class.java)
                context.startActivity(intent)

            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Next",
                fontSize = 22.sp
            )

        }







    }
}
@Preview
@Composable
private fun signinprev() {
    signin()
        }
