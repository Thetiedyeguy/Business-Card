package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF0D384E)
                ) {
                    Name(
                        name = getString(R.string.name),
                        title = getString(R.string.title)
                    )
                    ContactInfo(
                        phone = getString(R.string.phoneNumber),
                        email = getString(R.string.email),
                        social = getString(R.string.socialHandle)
                    )
                }
            }
        }
    }
}

@Composable
fun Name(name: String, title: String) {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        modifier = Modifier
            .padding(bottom = 200.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .padding(top = 5.dp, bottom = 5.dp)
        )
        Text(
            text = name,
            fontSize = 50.sp,
            color = Color(0xFFFFFFFF)
        )
        Text(
            text = title,
            fontSize = 30.sp,
            color = Color(0xFFFFFFFF)
        )
    }
}


@Composable
fun ContactInfo(phone: String, email: String, social: String){
    val phoneIcon = painterResource(id = R.drawable.phone_icon)
    val emailIcon = painterResource(id = R.drawable.mail_icon)
    val shareIcon = painterResource(id = R.drawable.share_icon)
    val bufferBefore = 30
    val bufferAfter = 15
    val bufferBetween = 10
    val bottomBuffer = 25
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            modifier = Modifier
                .padding(bottom = bufferBetween.dp)
        ) {
            Image(
                painter = phoneIcon,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = bufferBefore.dp, end = bufferAfter.dp)
            )
            Text(
                text = phone,
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp
            )
        }
        Row(
            modifier = Modifier
                .padding(bottom = bufferBetween.dp)
        ) {
            Image(
                painter = emailIcon,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = bufferBefore.dp, end = bufferAfter.dp)
            )
            Text(
                text = email,
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp
            )
        }
        Row(
            modifier = Modifier
                .padding(bottom = bottomBuffer.dp)
        ) {
            Image(
                painter = shareIcon,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = bufferBefore.dp, end = bufferAfter.dp)
            )
            Text(
                text = social,
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp
            )
        }
    }
}