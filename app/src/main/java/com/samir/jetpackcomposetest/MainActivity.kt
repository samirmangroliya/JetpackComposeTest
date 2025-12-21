package com.samir.jetpackcomposetest

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samir.jetpackcomposetest.ui.theme.JetpackComposeTestTheme

class MainActivity : ComponentActivity() {
    val list = listOf(
        "Alice",
        "Bob",
        "Katrina",
        "Alice",
        "Bob",
        "Katrina",
        "Alice",
        "Bob",
        "Katrina",
        "Alice",
        "Bob",
        "Katrina",
        "Alice",
        "Bob",
        "Katrina",
        "Alice",
        "Bob",
        "Katrina",
        "Alice",
        "Bob",
        "Katrina",
        "Alice",
        "Bob",
        "Katrina",
        "Alice",
        "Bob",
        "Katrina",
        "Alice",
        "Bob",
        "Katrina",
        "Alice",
        "Bob",
        "Katrina",
        "Alice",
        "Bob",
        "Katrina",
        "Alice",
        "Bob",
        "Katrina",
        "Jack",
        "John"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ListOfUsers(users = list, modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTestTheme {
        Greeting("Android")
    }
}

@Composable
fun ListOfUsers(users: List<String>, modifier: Modifier) {
    val context = LocalContext.current
    LazyColumn(
        Modifier.testTag("user_list")
    ) {
        items(users) { name ->
            Text(
                text = name,
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .padding(16.dp)
                    .testTag("user_$name")
                    .clickable(onClick = {
                        Toast.makeText(
                            context,
                            "Hello $name",
                            Toast.LENGTH_SHORT
                        ).show()
                    })
            )
        }

    }
}