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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.snapchat.ui.theme.SnapchatTheme

class WelcomeActivity : ComponentActivity() {
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
                    Welcome()
                }
            }
        }
    }
}
@Composable
fun Welcome() {
//    var firstName by remember { mutableStateOf("") }
//    var secondname by remember { mutableStateOf("") }
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
            fontSize = 45.sp,
            fontFamily = FontFamily.Cursive

        )

//        Image(painter = painterResource(id =R.drawable.pic2),contentDescription = null,
//            modifier = Modifier.padding(46.dp))

        Text(
            text = "Snap Inc",
            color = Color.Red,
            fontSize = 35.sp,
            fontFamily = FontFamily.Cursive

        )


        Text(
            text = "Terms and conditions",
            color = Color.Blue,
            fontSize = 35.sp,
            fontFamily = FontFamily.Cursive

        )
        Text(
            text = "Snap Inc. honors the requirements set forth in the Digital Millennium Copyright Act. We\n" +
                    "therefore take reasonable steps to expeditiously remove from our Services any\n" +
                    "infringing material that we become aware of. And if Snap Inc. becomes aware that one\n" +
                    "of its users has repeatedly infringed copyrights, we will take reasonable steps within our\n" +
                    "power to terminate the user’s account.\n" +
                    "We make it easy for you to report suspected copyright infringement. If you believe that\n" +
                    "anything on the Services infringes a copyright that you own or control, please fill out this\n" +
                    "form. Or you may file a notice with our designated agent:\n" +
                    "Snap Inc.\n" +
                    "Attn: Copyright Agent\n" +
                    "63 Market Street\n" +
                    "Venice, CA 90291\n" +
                    "email: copyright@snap.com\n" +

                    "provide a statement that the information in the notification is accurate and, under\n" +
                    "penalty of perjury, that you are authorized to act on behalf of the copyright owner",
            color = Color.Black,
            fontSize = 15.sp,
            fontFamily = FontFamily.Serif

        )
        Spacer(
            modifier = Modifier
                .height(30.dp)
        )



        Text(
            text = "Safety",
            color = Color.Blue,
            fontSize = 35.sp,
            fontFamily = FontFamily.Cursive

        )


        Button(
            onClick = {
                val intent = Intent(context, SnapchatInActivity::class.java)
                context.startActivity(intent)

            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Agree",
                fontSize = 12.sp
            )

        }
    }
}

@Preview
@Composable
private fun Welcomeprev() {
    Welcome()
        }



