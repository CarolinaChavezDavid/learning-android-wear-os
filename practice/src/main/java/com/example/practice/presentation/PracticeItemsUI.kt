package com.example.practice.presentation

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.Icon
import com.example.practice.R

@Composable
fun PersonalizedButton() {
    Button(
        modifier = Modifier.size(ButtonDefaults.LargeButtonSize),
        onClick = { /*TODO*/ },
        enabled = true,
    ) {
        Icon(
            painter = painterResource(
                id = R.drawable.baseline_local_phone_24,
            ),
            contentDescription = "Phone",
            modifier = Modifier
                .size(24.dp)
                .wrapContentSize(align = Alignment.Center),
        )
//
    }
}
