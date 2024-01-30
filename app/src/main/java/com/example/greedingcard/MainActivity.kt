package com.example.greedingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greedingcard.ui.theme.GreedingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GreedingCardTheme {
                GreetingCard("Gabriel Lisboa", "Senior Software Engineer")
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun GreetingCard(name: String, role: String, modifier: Modifier = Modifier) {
    Surface(modifier = modifier.fillMaxSize(), color = MaterialTheme.colorScheme.primary) {
        Column(verticalArrangement = Arrangement.SpaceAround, horizontalAlignment = Alignment.CenterHorizontally) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Surface(
                    color = MaterialTheme.colorScheme.tertiary,
                    modifier = Modifier.size(150.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.android_logo),
                        contentDescription = "Android Logo",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Text(text = name, fontSize = 42.sp, color = MaterialTheme.colorScheme.tertiary)
                Text(text = role, fontSize = 16.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.tertiary)
            }
            FlowColumn(
                horizontalArrangement = Arrangement.Center,
                verticalArrangement = Arrangement.Bottom
            ) {
                Row {
                    Icon(
                        painter = painterResource(androidx.core.R.drawable.ic_call_answer),
                        contentDescription = "Phone number",
                        modifier = Modifier
                            .size(20.dp),
                        tint = MaterialTheme.colorScheme.tertiary
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = "+55 62 98149-8524", color = MaterialTheme.colorScheme.tertiary)
                }
                Spacer(modifier = Modifier.height(12.dp))
                Row {
                    Icon(
                        painter = painterResource(android.R.drawable.ic_menu_share),
                        contentDescription = "Phone number",
                        modifier = Modifier.size(20.dp),
                        tint = MaterialTheme.colorScheme.tertiary
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = "@lisgoood_", color = MaterialTheme.colorScheme.tertiary)
                }
                Spacer(modifier = Modifier.height(12.dp))
                Row {
                    Icon(
                        painter = painterResource(android.R.drawable.ic_dialog_email),
                        contentDescription = "Phone number",
                        modifier = Modifier.size(20.dp),
                        tint = MaterialTheme.colorScheme.tertiary
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = "gabriellisboa.rx@gmail.com",
                        color = MaterialTheme.colorScheme.tertiary
                    )
                }
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    GreedingCardTheme {
        GreetingCard("Gabriel Lisboa", "Senior Software Engineer")
    }
}