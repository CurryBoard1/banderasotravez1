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
                    BanderaColombia(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun BanderaColombia(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(Modifier.weight(2f).fillMaxWidth().background(Color(0xFFFCD116)))
        Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFF003893)))
        Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFFCE1126)))
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaColombiaPreview() {
    BanderasotravezTheme {
        Surface {
            BanderaColombia(modifier = Modifier.fillMaxSize())
        }
    }
}
