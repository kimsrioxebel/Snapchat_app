package com.example.snapchat

import android.content.Intent
import android.os.Bundle
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
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.snapchat.ui.theme.SnapchatTheme

class SnapchatInActivity : ComponentActivity() {
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
                    Snapchat()
                }
            }
        }
    }
}
@Composable
fun Snapchat() {
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
            color = Color.Red,
            fontSize = 45.sp,
            fontFamily = FontFamily.Cursive

        )

        Text(
            text = "Home Of Fun",
            color = Color.Black,
            fontSize = 55.sp,
            fontFamily = FontFamily.Cursive

        )
//        Text(
//            text = "You Can Chat With Your Friends Here" +
//                    "Chat With Yuor Friends Here",
//            color = Color.Red,
//            fontSize = 55.sp,
//            fontFamily = FontFamily.Cursive
//        )



//        Image(
//            painter = painterResource(id = R.drawable.pic2), contentDescription = null,
//            modifier = Modifier
//                .fillMaxSize()
//                .fillMaxWidth()
//        )

        Button(
            onClick = {
                val intent = Intent(context, com.example.snapchat.InActivity::class.java)
                context.startActivity(intent)

            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Welcome",
                fontSize = 22.sp
            )
//            Text(
//                text = "Where you can take your favourites pictures " +
//                        "and chat with Friends",
//                fontSize = 12.sp
//            )
        }
        Text(
            text = "Where you can take your favourites pictures " +
                    "and chat with Friends",
            fontSize = 42.sp ,
            fontFamily = FontFamily.Cursive,
            color=Color.Red
        )





        Image(
            painter = painterResource(id = R.drawable.pic2), contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
        )


        }




        }



@Preview
@Composable
private fun Snapchatprev() {
    Snapchat()
        }



