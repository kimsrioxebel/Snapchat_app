package com.example.snapchat

import android.app.Activity
import android.os.Bundle
import android.provider.MediaStore
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
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
import androidx.core.app.ActivityCompat
import com.example.snapchat.ui.theme.SnapchatTheme

class InActivity : ComponentActivity() {
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
                    In()
                }
            }
        }
    }
}
@Composable
fun In() {
    val context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(16.dp)
    ) {
        Text(
            text = "Welcome To " +
                    "Snapchat",
            color = Color.Cyan,
            fontFamily = FontFamily.SansSerif,
            fontSize = 45.sp
        )
        Image(painter = painterResource(id = R.drawable.pic), contentDescription =null )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = {
                val takePictureIntent = android.content.Intent(MediaStore.ACTION_IMAGE_CAPTURE)

                ActivityCompat.startActivityForResult(
                    context as Activity,
                    takePictureIntent,
                    1,
                    null
                )
            },
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()

        ) {
            Text(
                text = "Camera",
                fontSize = 30.sp
            )


        }
        Spacer(modifier = Modifier.height(40.dp))
        Spacer(modifier = Modifier.height(50.dp))
        Spacer(modifier = Modifier.height(50.dp))
        Spacer(modifier = Modifier.height(50.dp))
        Spacer(modifier = Modifier.height(50.dp))
        Spacer(modifier = Modifier.height(50.dp))
        Spacer(modifier = Modifier.height(50.dp))
        Spacer(modifier = Modifier.height(50.dp))
        Spacer(modifier = Modifier.height(50.dp))
        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "Chat with friends",
            color = Color.Cyan,
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp
        )
    }
}@Preview
@Composable
private fun Inprev() {
    In()
}
