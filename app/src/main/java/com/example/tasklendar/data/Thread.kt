package com.example.tasklendar.data

import androidx.compose.ui.graphics.Brush

data class Thread(
    val cardType: String,
    val cardNumber: String,
    val cardName: String,
    val balance: Double,
    val color: Brush
)
