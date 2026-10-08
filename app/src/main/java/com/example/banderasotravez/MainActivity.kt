package com.example.banderasotravez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderasotravez.ui.theme.BanderasotravezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BanderasotravezTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BanderaEspana(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun BanderaEspana(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFFAA151B)))
        Box(Modifier.weight(2f).fillMaxWidth().background(Color(0xFFF1BF00)))
        Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFFAA151B)))
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaEspanaPreview() {
    BanderasotravezTheme {
        Surface {
            BanderaEspana(modifier = Modifier.fillMaxSize())
        }
    }
}
