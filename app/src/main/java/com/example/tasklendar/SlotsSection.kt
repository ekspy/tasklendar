package com.example.tasklendar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MonetizationOn
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tasklendar.data.Slot
import com.example.tasklendar.ui.theme.BlueStart
import com.example.tasklendar.ui.theme.GreenStart
import com.example.tasklendar.ui.theme.OrangeStart
import com.example.tasklendar.ui.theme.PurpleStart

// Mock data por enquanto, deve ser integrada a lista real com room
val slotsList = listOf(
    Slot(
        icon = Icons.Rounded.StarHalf,
        name = "Projeto",
        background = OrangeStart
    ),

    Slot(
        icon = Icons.Rounded.Wallet,
        name = "Trabalho",
        background = BlueStart
    ),

    Slot(
        icon = Icons.Rounded.StarHalf,
        name = "Universidade",
        background = PurpleStart
    ),

    Slot(
        icon = Icons.Rounded.MonetizationOn,
        name = "Leitura",
        background = GreenStart
    ),
)

@Preview
@Composable
fun SlotSection() {
    Column {
        Text(
            text = "Slots",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )

        LazyRow {
            items(slotsList.size) {
                SlotItem(it)
            }
        }
    }
}

@Composable
fun SlotItem(
    index: Int
) {
    val finance = slotsList[index]
    var lastPaddingEnd = 0.dp
    if (index == slotsList.size - 1) {
        lastPaddingEnd = 16.dp
    }

    Box(modifier = Modifier.padding(start = 16.dp, end = lastPaddingEnd)) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(MaterialTheme.colorScheme.secondaryContainer)
                .size(120.dp)
                .clickable {}
                .padding(13.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(finance.background)
                    .padding(6.dp)
            ) {
                Icon(
                    imageVector = finance.icon,
                    contentDescription = finance.name,
                    tint = Color.White
                )
            }

            Text(
                text = finance.name,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                fontWeight = FontWeight.SemiBold,
                fontSize = 15.sp
            )

        }
    }
}













