package com.example.mymoviesapp.screens

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ){
        Text(text = "Test")
    }
}