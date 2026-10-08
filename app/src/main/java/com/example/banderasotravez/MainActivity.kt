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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderasotravez.ui.theme.BanderasotravezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BanderasotravezTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BanderaArgentina(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun BanderaArgentina(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(Modifier.fillMaxSize()) {
            Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFF74ACDF)))
            Box(Modifier.weight(1f).fillMaxWidth().background(Color.White))
            Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFF74ACDF)))
        }
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .size(50.dp)
                .clip(CircleShape)
                .background(Color(0xFFF6B40E))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaArgentinaPreview() {
    BanderasotravezTheme {
        Surface {
            BanderaArgentina(modifier = Modifier.fillMaxSize())
        }
    }
}
