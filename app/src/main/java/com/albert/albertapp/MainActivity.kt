package com.albert.albertapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.albert.albertapp.ui.theme.AlbertappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlbertappTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                   // Greeting("Android")
                    home()
                }
            }
        }
    }
}

@Composable
fun home() {

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)) {
        Text(text = "Albert's app",
            color = Color.Red,
            fontSize = 28.sp,
            fontFamily = FontFamily.Monospace
        )
        Image(painter = painterResource(id = R.drawable.pic2),
            contentDescription = "makeup",)
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Welcome to my Android app.",
            color = Color.Blue,
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp,
        )
        Image(painter = painterResource(id = R.drawable.pic1),
            contentDescription = "makeup",)
    }

}

@Preview
@Composable
private fun homeprevie() {
    home()
}