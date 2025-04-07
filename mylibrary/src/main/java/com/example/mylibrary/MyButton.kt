package com.example.mylibrary

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MyButton(
    text: String, onClick: () -> Unit
) {
    Button(onClick = onClick) {
        Text(text)
    }
}

@Preview(showBackground = true)
@Composable
fun MyButtonPreview() {
    MyButton(text = "Click Me") {}
}