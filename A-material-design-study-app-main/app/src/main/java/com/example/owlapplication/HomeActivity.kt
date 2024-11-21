package com.example.owlapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.owlapplication.ui.theme.OwlApplicationTheme

class HomeActivity : ComponentActivity() {
    private lateinit var databaseHelper: UserDatabaseHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen(this)
        }
    }
}
@Composable
fun HomeScreen(context: Context) {

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var error by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(painterResource(id = R.drawable.study_login), contentDescription = "")

        Text(
            fontSize = 28.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Default,
            text = "A Material Design Study App"
        )
        Text(
            fontSize = 20.sp,
            fontWeight = FontWeight.Black,
            fontFamily = FontFamily.Serif,
            text = "\n Developed By"
        )
        Text(
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily.Default,
            text = "Sivalingam, \nSivabalan, \nSivadharshini, \nSneha"
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                        context.startActivity(
                            Intent(
                                context,
                                LoginActivity::class.java
                            )
                        )
                        //onLoginSuccess()
            },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(text = "Start")
        }
//        Row {
//            TextButton(onClick = {context.startActivity(
//                Intent(
//                    context,
//                    RegisterActivity::class.java
//                )
//            )}
//            )
//            { Text(text = "Register") }
//            TextButton(onClick = {
//            })
//
//            {
//                Spacer(modifier = Modifier.width(60.dp))
//                Text(text = "Forget password?")
//            }
//        }
    }
}
private fun startMainPage(context: Context) {
    val intent = Intent(context, MainActivity::class.java)
    ContextCompat.startActivity(context, intent, null)
}