package com.example.visprog_week2_assignment

import androidx.compose.ui.text.font.Font
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontFamily

val Poppins = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal)
)
@Composable
fun Soal2view() {
    var q1 by remember {mutableStateOf("") }
    var q2 by remember {mutableStateOf("") }
    var q3 by remember {mutableStateOf("") }
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.aurora),
            contentDescription = "Image 2",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier =
                Modifier
                    .fillMaxSize()
                    .border(width = 2.dp, color = Color.Black)
                    .padding(top = 35.dp)
        ) {
            Spacer(Modifier.height(280.dp))
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        color = Color(0xFF383c5c),
                        shape = RoundedCornerShape(
                            topStart = 32.dp,
                            topEnd = 32.dp,
                            bottomStart = 0.dp,
                            bottomEnd = 0.dp
                        )
                    )
            ){
                Column(
                    modifier = Modifier.fillMaxWidth()
                        .padding(25.dp)
                ) {
                    Spacer(Modifier.height(10.dp))
                    Text(
                        text = "My Travel",
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = Poppins,
                        fontSize = 36.sp,
                        color = Color.White
                    )
                    Spacer(Modifier.height(26.dp))
                    Text(
                        text = "Aurora",
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = Poppins,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Spacer(Modifier.height(6.dp))
                    Text(
                        text = "Tromsø, Norway",
                        fontSize = 16.sp,
                        fontFamily = Poppins,
                        color = Color.White
                    )
                    Spacer(Modifier.height(14.dp))
                    Text(
                        text = "★★★★★   5.0",
                        fontSize = 20.sp,
                        fontFamily = Poppins,
                        color = Color(0XFFfccf65),
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(Modifier.height(26.dp))
                    TextField(
                        value = q1,
                        onValueChange = { q1 = it },
                        placeholder = {
                            Text("What did you enjoy most about your trip?",
                                color = Color(0xFF69707a),
                                fontSize = 12.sp,
                                fontFamily = Poppins
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true,
                        shape = RoundedCornerShape(6.dp),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color(0xFFd9ecff),
                            unfocusedContainerColor = Color(0xFFd9ecff),
                            focusedTextColor = Color.Black,
                            unfocusedTextColor = Color.Black,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        )
                    )
                    Spacer(Modifier.height(14.dp))
                    TextField(
                        value = q2,
                        onValueChange = { q2 = it },
                        placeholder = {
                            Text("What was your favorite spot?",
                                color = Color(0xFF69707a),
                                fontSize = 12.sp,
                                fontFamily = Poppins
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true,
                        shape = RoundedCornerShape(6.dp),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color(0xFFd9ecff),
                            unfocusedContainerColor = Color(0xFFd9ecff),
                            focusedTextColor = Color.Black,
                            unfocusedTextColor = Color.Black,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        )
                    )
                    Spacer(Modifier.height(14.dp))
                    TextField(
                        value = q3,
                        onValueChange = { q3 = it },
                        placeholder = {
                            Text("Anything else you'd like to add?",
                                color = Color(0xFF69707a),
                                fontSize = 12.sp,
                                fontFamily = Poppins
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true,
                        shape = RoundedCornerShape(6.dp),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color(0xFFd9ecff),
                            unfocusedContainerColor = Color(0xFFd9ecff),
                            focusedTextColor = Color.Black,
                            unfocusedTextColor = Color.Black,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        )
                    )
                    Spacer(Modifier.height(14.dp))
                    FloatingActionButton(
                        onClick = {},
                        modifier = Modifier
                            .size(50.dp)
                            .offset(x = 5.dp, y = 15.dp)
                            .align(Alignment.End),
                        containerColor = Color(0xFFd9ecff),
                        shape = RoundedCornerShape(14.dp)
                    ) {
                        Text(
                            text = "+",
                            fontSize = 30.sp
                        )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Soal2preview() {
    Soal2view()
}