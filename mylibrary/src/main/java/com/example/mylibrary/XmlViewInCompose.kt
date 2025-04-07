package com.example.mylibrary

import android.view.LayoutInflater
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.example.mylibrary.databinding.CustomViewBinding

@Composable
fun XmlViewInCompose(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = modifier,
        factory = { context ->
            val binding = CustomViewBinding.inflate(LayoutInflater.from(context))
            binding.customTextView.text = "Compose에서 동적 변경됨!" // 동적 데이터 바인딩
            binding.root
        }
    )
}
