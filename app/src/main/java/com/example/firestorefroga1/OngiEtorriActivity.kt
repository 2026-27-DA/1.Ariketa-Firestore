package com.example.firestorefroga1

import androidx.activity.ComponentActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class OngiEtorriActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val user = intent.getStringExtra("user") ?: ""

        setContent {
            OngiEtorriScreen(
                user,
                bueltan = {finish()})
        }
    }
}

@Composable
fun OngiEtorriScreen(user: String, bueltan: () -> Unit) {

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Text(
            text = "Ongi Etorri $user",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.Blue
        )

            Button(onClick = bueltan)
            {
                Text("Itzuli")
            }
        }
}
