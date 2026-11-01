package com.nizamai.assistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Color Palette
val EmeraldGreen = Color(0xFF087F5B)
val DeepForestGreen = Color(0xFF064E3B)
val IvoryWhite = Color(0xFFFFFFF0)
val ChampagneGold = Color(0xFFD6B76C)
val SoftMint = Color(0xFFE8F5EF)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = IvoryWhite
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(IvoryWhite)
                            .padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "NIZAM AI",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold,
                            color = DeepForestGreen
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Your Personal AI Agent",
                            fontSize = 16.sp,
                            color = EmeraldGreen
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        Card(
                            colors = CardDefaults.cardColors(containerColor = SoftMint),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(
                                    text = "Ready to connect",
                                    fontWeight = FontWeight.SemiBold,
                                    color = DeepForestGreen
                                )
                                Text(
                                    text = "Features: AI Chat, Job Agent, OneDrive Memory, Web Search",
                                    fontSize = 13.sp,
                                    color = Color(0xFF202923)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
