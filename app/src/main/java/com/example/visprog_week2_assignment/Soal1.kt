package com.example.visprog_week2_assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Soal1view() {
    Column(modifier =
        Modifier
            .fillMaxSize()
            .background(Color(0xFF446daf))
            .border(width = 2.dp, color = Color.Black)
            .padding(top = 35.dp, start = 25.dp, end = 25.dp)) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Liked Songs",
                modifier = Modifier.align(Alignment.Center),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

            Text(
                text = "﹀",
                modifier = Modifier.align(Alignment.CenterStart),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

            Text(
                text = "•••",
                modifier = Modifier.align(Alignment.CenterEnd),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
        }
        Spacer(Modifier.height(30.dp))
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.never_gonna),
                contentDescription = "Image 1",
                modifier = Modifier.size(351.dp).border(3.dp, Color.Black)
            )
        }
        Spacer(Modifier.height(30.dp))
        Box(
            modifier = Modifier.fillMaxWidth(),
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Never Gonna Give You Up",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
                Text(
                    text = "Rick Astley",
                    color = Color.Black,
                    fontSize = 18.sp
                )
            }

            Text(
                text = "♥",
                modifier = Modifier.align(Alignment.CenterEnd),
                color = Color.Black,
                fontSize = 40.sp
            )


        }
        Spacer(Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
                .background(Color.Black)
        )
        Spacer(Modifier.height(8.dp))
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "0:12",
                modifier = Modifier.align(Alignment.CenterStart),
                fontSize = 14.sp
            )

            Text(
                text = "-3:23",
                modifier = Modifier.align(Alignment.CenterEnd),
                fontSize = 14.sp
            )
        }
        Spacer(Modifier.height(8.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            contentAlignment = Alignment.Center
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "|◀",
                    color = Color.Black,
                    fontSize = 30.sp
                )

                Box(
                    modifier = Modifier
                        .size(75.dp)
                        .background(Color.Black, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "I I",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp
                    )
                }

                Text(
                    text = "▶|",
                    color = Color.Black,
                    fontSize = 30.sp
                )
            }
        }
        Spacer(Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = Color(0xFF34588F),
                    shape = RoundedCornerShape(
                        topStart = 16.dp,
                        topEnd = 16.dp,
                        bottomStart = 0.dp,
                        bottomEnd = 0.dp
                    )
                )
        ){
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(25.dp)
            ) {
                Column {
                    Text(
                        text = "Lyrics",
                        color = Color.White,
                        fontSize = 20.sp
                    )

                    Spacer(Modifier.height(10.dp))

                    Text(
                        text = "We're no strangers to love\n" +
                                "You know the rules and so do I\n" +
                                "A full commitment's what I'm thinking of\n" +
                                "You wouldn't get this from any other guy\n" +
                                "I just wanna tell you how I'm feeling\n" +
                                "Gotta make you understand\n\n" +
                                "Never gonna give you up\n" +
                                "Never gonna let you down\n" +
                                "Never gonna run around and desert you\n" +
                                "Never gonna make you cry\n" +
                                "Never gonna say goodbye\n" +
                                "Never gonna tell a lie and hurt you\n\n" +
                                "We've known each other for so long\n" +
                                "Your heart's been aching, but you're too shy to say it\n" +
                                "Inside, we both know what's been going on\n" +
                                "We know the game, and we're gonna play it\n\n" +
                                "And if you ask me how I'm feeling\n" +
                                "Don't tell me you're too blind to see\n\n" +
                                "Never gonna give you up\n" +
                                "Never gonna let you down\n" +
                                "Never gonna run around and desert you\n" +
                                "Never gonna make you cry\n" +
                                "Never gonna say goodbye\n" +
                                "Never gonna tell a lie and hurt you\n\n" +
                                "Never gonna give you up\n" +
                                "Never gonna let you down\n" +
                                "Never gonna run around and desert you\n" +
                                "Never gonna make you cry\n" +
                                "Never gonna say goodbye\n" +
                                "Never gonna tell a lie and hurt you\n\n" +
                                "Ooh (Give you up)\n" +
                                "Ooh-ooh (Give you up)\n" +
                                "Ooh (Never gonna give, never gonna give)\n" +
                                "Give you up\n" +
                                "Ooh-ooh (Never gonna give, never gonna give)\n" +
                                "Give you up\n\n" +
                                "We've known each other for so long\n" +
                                "Your heart's been aching, but you're too shy to say it\n" +
                                "Inside, we both know what's been going on\n" +
                                "We know the game, and we're gonna play it\n\n" +
                                "I just wanna tell you how I'm feeling\n" +
                                "Gotta make you understand\n\n" +
                                "Never gonna give you up\n" +
                                "Never gonna let you down\n" +
                                "Never gonna run around and desert you\n" +
                                "Never gonna make you cry\n" +
                                "Never gonna say goodbye\n" +
                                "Never gonna tell a lie and hurt you\n\n" +
                                "Never gonna give you up\n" +
                                "Never gonna let you down\n" +
                                "Never gonna run around and desert you\n" +
                                "Never gonna make you cry\n" +
                                "Never gonna say goodbye\n" +
                                "Never gonna tell a lie and hurt you\n\n" +
                                "Never gonna give you up\n" +
                                "Never gonna let you down\n" +
                                "Never gonna run around and desert you\n" +
                                "Never gonna make you cry\n" +
                                "Never gonna say goodbye\n" +
                                "Never gonna tell a lie and hurt you\n\n" +
                                "Never gonna give you up\n" +
                                "Never gonna let you down\n" +
                                "Never gonna run around and desert you\n" +
                                "Never gonna make you cry\n" +
                                "Never gonna say goodbye\n" +
                                "Never gonna tell a lie and hurt you",
                        color = Color.White,
                        fontSize = 14.sp
                    )
                }
            }


        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Soal1preview() {
    Soal1view()
}