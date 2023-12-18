package com.developer753.news753.ui.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Btn(modifier: Modifier = Modifier, size:Int=100, onClick:()->Unit, text:String, containerColor: Color = MaterialTheme.colorScheme.primary, isSystemInDarkMode:Boolean= isSystemInDarkTheme()){
    Button(onClick = onClick, colors = ButtonDefaults.buttonColors(containerColor = if (isSystemInDarkMode) Color.Black else containerColor, contentColor =  if (containerColor== Color.White) Color.Black else Color.White), modifier = modifier.width(size.dp)) {
        Text(text = text, style = MaterialTheme.typography.labelMedium )
    }
}

@Preview(showSystemUi = true)
@Composable
fun ButtonPreview(){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Btn(onClick = { /*TODO*/ }, text = "Hello")
            Btn(onClick = { /*TODO*/ }, text = "World", size = 230, containerColor = Color.White)
            Btn(onClick = { /*TODO*/ }, text = "Welcome", size = 200, containerColor = Color.Black)
        }
}