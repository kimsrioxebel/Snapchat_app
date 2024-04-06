package com.example.snapchat

import android.content.Intent
import android.os.Bundle
import android.telecom.Call.Details
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.snapchat.ui.theme.SnapchatTheme

class DetailsActivity : ComponentActivity() {
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
                    Details()
                }
            }
        }
    }
}

@Composable
fun Details() {
    var firstName by remember { mutableStateOf("") }
    var secondname by remember { mutableStateOf("") }
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
            text = "Snapchat",
            color = Color.Black,
            fontSize = 40.sp,
            fontFamily = FontFamily.Serif

        )

        Spacer(
            modifier = Modifier
                .height(30.dp)
        )



        Icon(imageVector = Icons.Default.Person, contentDescription = "Person")

        Spacer(
            modifier = Modifier
                .height(30.dp)
        )



        Text(
            text = "Enter First Name",
            color = Color.Blue,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif

        )



        OutlinedTextField(
            value = firstName,
            onValueChange = { firstName = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "email"
                )
            },

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

        Text(
            text = "Enter Last Name",
            color = Color.Blue,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif

        )
        OutlinedTextField(
            value = secondname,
            onValueChange = { secondname = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Pass") },
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

        Text(
            text = "Gender",
            color = Color.Blue,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif

        )
        OutlinedTextField(
            value = secondname,
            onValueChange = { secondname = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Pass") },
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
        Button(
            onClick = {
                val intent = Intent(context, com.example.snapchat.WelcomeActivity::class.java)
                context.startActivity(intent)

            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Login",
                fontSize = 22.sp
            )

        }
        Spacer(
            modifier = Modifier
                .height(30.dp)
        )
    }
}










@Preview
@Composable
private fun Detailsprev() {
    Details()
}
