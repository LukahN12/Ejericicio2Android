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
                        nombre = "Lucas Melero Garcia",
                        from = "Tarjeta de presentación",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(nombre: String, from: String, email: String = "lukahMG12@gmail.com", telefono: String = "+34 123 45 67 89", redSocial: String = "@lukah", modifier: Modifier = Modifier) {
    val TAMANOLETRA = 28
    val image = painterResource(R.drawable.a_round_fat_seal_smiling_underwater)
    val imageTelefono = painterResource(R.drawable.green_telephone_icon_telephone_icon_ai_format_free_vector)
    val imageEmail = painterResource(R.drawable._95645)
    val imageRedSocial = painterResource(R.drawable._4207282)

    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(top = 190.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Bottom,
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
                text = nombre,
                fontSize = TAMANOLETRA.sp,
                lineHeight = 25.sp,
                modifier = Modifier
                    .padding(horizontal = 50.dp, vertical = 10.dp)
            )
            Text(
                text = from,
                fontSize = TAMANOLETRA.sp,
                modifier = Modifier
                    .padding(horizontal = 50.dp, vertical = 10.dp)
            )
        }

        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.padding(top = 125.dp)
        ) {
            Row() {
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = imageTelefono,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(10.dp)
                            .height(25.dp)
                            .width(25.dp)

                    )

                    Image(
                        painter = imageEmail,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(10.dp)
                            .height(25.dp)
                            .width(25.dp)

                    )

                    Image(
                        painter = imageRedSocial,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(10.dp)
                            .height(25.dp)
                            .width(25.dp)

                    )
                }

                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = telefono,
                        fontSize = (TAMANOLETRA - 10).sp,
                        lineHeight = 25.sp,
                        modifier = Modifier
                            .padding(horizontal = 50.dp, vertical = 10.dp)
                    )

                    Text(
                        text = redSocial,
                        fontSize = (TAMANOLETRA - 10).sp,
                        lineHeight = 25.sp,
                        modifier = Modifier
                            .padding(horizontal = 50.dp, vertical = 10.dp)
                    )

                    Text(
                        text = email,
                        fontSize = (TAMANOLETRA - 10).sp,
                        lineHeight = 25.sp,
                        modifier = Modifier
                            .padding(horizontal = 50.dp, vertical = 10.dp)
                    )
                }
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