package br.com.aldemir.bottomsheetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.aldemir.bottomsheetcompose.ui.components.BottomSheet
import br.com.aldemir.bottomsheetcompose.ui.components.BottomSheetContent
import br.com.aldemir.bottomsheetcompose.ui.components.MyBottomSheetScaffold
import br.com.aldemir.bottomsheetcompose.ui.theme.BottomSheetComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomSheetComposeTheme {

                var showBottomSheet by remember { mutableStateOf(false) }
                var showBottomSheetScaffold by remember { mutableStateOf(false) }

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(onClick = {
                            showBottomSheet = !showBottomSheet
                        }) {
                            Text(text = "Show Bottom Sheet")
                        }
                        Button(onClick = {
                            showBottomSheetScaffold = !showBottomSheetScaffold
                        }) {
                            Text(text = "Show Bottom Sheet scaffold")
                        }
                        if (showBottomSheet) BottomSheet(color = Color.White, content = { BottomSheetContent() })
                        if (showBottomSheetScaffold) MyBottomSheetScaffold(content = { BottomSheetContent() })
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BottomSheetComposeTheme {
        BottomSheet(
            content = { BottomSheetContent() }
        )
    }
}