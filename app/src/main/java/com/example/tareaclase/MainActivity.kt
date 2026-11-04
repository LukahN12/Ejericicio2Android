package com.example.tareaclase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tareaclase.ui.theme.TareaClaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TareaClaseTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingText(
                        message = "Lucas Melero Garcia",
                        from = "Tarjeta de presentación",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String,
                 modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.a_round_fat_seal_smiling_underwater)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
        ) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(30.dp)
                    .height(125.dp)
                    .width(125.dp)
            )
            Text(
                text = message,
                fontSize = 25.sp,
                lineHeight = 25.sp,
                modifier = Modifier
                    .padding(horizontal = 50.dp, vertical = 10.dp)
            )
            Text(
                text = from,
                fontSize = 25.sp,
                modifier = Modifier
                    .padding(horizontal = 50.dp, vertical = 10.dp)
            )
        }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row() {
                Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(5.dp)
                    .height(25.dp)
                    .width(25.dp)

                )

                Text(
                    text = message,
                    fontSize = 20.sp,
                    lineHeight = 25.sp,
                    modifier = Modifier
                        .padding(horizontal = 50.dp, vertical = 10.dp)
                )

            }

            Row() {
                Image(
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .height(25.dp)
                        .width(25.dp)

                )

                Text(
                    text = message,
                    fontSize = 20.sp,
                    lineHeight = 25.sp,
                    modifier = Modifier
                        .padding(horizontal = 50.dp, vertical = 10.dp)
                )

            }

            Row() {
                Image(
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .height(25.dp)
                        .width(25.dp)

                )

                Text(
                    text = message,
                    fontSize = 20.sp,
                    lineHeight = 25.sp,
                    modifier = Modifier
                        .padding(horizontal = 50.dp, vertical = 10.dp)
                )

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TareaClaseTheme {
        GreetingText("Android", "Android")
    }
}