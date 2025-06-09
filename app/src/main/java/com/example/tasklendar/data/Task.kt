package com.example.tasklendar.data

import androidx.compose.ui.graphics.vector.ImageVector

data class Task (
    val name: String,
    val expectedTime: Int,
    val state: String,
    val icon: ImageVector
)