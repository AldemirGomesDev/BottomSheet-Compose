package br.com.aldemir.bottomsheetcompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BottomSheetContent() {
    Column(
    ) {
        Box(
            modifier = Modifier
                .height(56.dp)
                .fillMaxWidth()
                .background(color = MaterialTheme.colors.primary)
        ) {
            Text(
                text = "Swipe up to Expand the sheet",
                style = MaterialTheme.typography.h6,
                modifier = Modifier.align(alignment = Alignment.Center),
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(32.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 32.dp)
        ) {
            Text(
                text = "Click outside the bottom sheet to hide it",
                style = MaterialTheme.typography.body1
            )
        }
        Spacer(modifier = Modifier.height(64.dp))
    }
}