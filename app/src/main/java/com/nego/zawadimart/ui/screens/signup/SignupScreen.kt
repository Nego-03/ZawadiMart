package com.nego.zawadimart.ui.screens.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nego.zawadimart.ui.theme.newNavy
import com.nego.zawadimart.ui.theme.newOrange
import com.nego.zawadimart.ui.theme.newWhite

@Composable
fun SignupScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        //box
        Box() {
            //Card
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(bottomStart = 80.dp, bottomEnd = 80.dp),
                colors = CardDefaults.cardColors(newWhite)
            ) {

            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(800.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .offset(y = 300.dp),



                ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "The Most Worth",
                        fontSize = 50.sp,
                        color = newOrange,
                        fontFamily = FontFamily.SansSerif,
                        textAlign = TextAlign.Center,



                        )
                    Text(text = "Grocery App",
                        fontSize = 50.sp,
                        color = newOrange,
                        fontFamily = FontFamily.SansSerif,
                        textAlign = TextAlign.Center,



                        )
                }
            }
            //End of Card

        }
        //End of Box
    }

}

@Preview(showBackground = true)
@Composable
fun SignupScreenPreview(){

    SignupScreen(rememberNavController())
}