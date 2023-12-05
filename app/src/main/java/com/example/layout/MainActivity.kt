package com.example.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layout.ui.theme.LayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                ScreenLayout()
                }
            }
        }
    }
}

@Composable
fun ScreenLayout() {
    Column{
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Red)
                .padding(8.dp)
                .weight(1f) // Set equal weight for all elements within column
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f) // Set equal weight for all elements within row
                    .background(Color.White)
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f) // Set equal weight for all elements within row
                    .background(Color.Yellow)
            )
        }
        Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .weight(1f) // Set equal weight for all elements within column
        ){}
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
                .weight(1f) // Set equal weight for all elements within column
        ){}
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun LayoutPreview() {
    LayoutTheme {
        ScreenLayout()
    }
}