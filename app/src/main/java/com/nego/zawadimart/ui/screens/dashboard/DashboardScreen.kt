package com.nego.zawadimart.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nego.zawadimart.R
import com.nego.zawadimart.ui.theme.newOrange
import com.nego.zawadimart.ui.theme.newWhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize().background(newOrange)) {
        //box
        Box() {
           //Card
           Card(
               modifier = Modifier.fillMaxWidth().height(300.dp),
               shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
               colors = CardDefaults.cardColors(newWhite)
           ) {
               TopAppBar(
                   title = { Text(text = "Dashboard Section")},
                   navigationIcon = {
                       IconButton(onClick = {}) {
                           Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                       }
                   },

                   )

           }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .padding(start = 20.dp, end = 20.dp)
                    .offset(y = 90.dp),



            ) {
                Text(text = "Welcome to ZawadiMart's Dashboard",
                    fontSize = 20.sp,
                    color = newOrange,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center,



                )
            }
           //End of Card

       }
        //End of Box
        Spacer(modifier = Modifier.height(100.dp))

        //Row
        Row( modifier = Modifier.padding(start = 20.dp) ) {

            //Card 1
            Card(
                modifier = Modifier.width(150.dp).height(180.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.home),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Home", fontSize = 15.sp)
                }
            }

            //End of Card 1

            Spacer(modifier = Modifier.width(20.dp))

            //Card 2
            Card(
                modifier = Modifier.width(150.dp).height(180.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "About", fontSize = 15.sp)
                }
            }

            //End of Card 2

        }
        //End of Row
        Spacer(modifier = Modifier.height(20.dp))
        //Row2
        Row( modifier = Modifier.padding(start = 20.dp) ) {

            //Card 1
            Card(
                modifier = Modifier.width(150.dp).height(180.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.contact),
                        contentDescription = "contact",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Contact Us", fontSize = 15.sp)
                }
            }

            //End of Card 1

            Spacer(modifier = Modifier.width(20.dp))

            //Card 2
            Card(
                modifier = Modifier.width(150.dp).height(180.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.product),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Products", fontSize = 15.sp)
                }
            }

            //End of Card 2

        }
        //End of Row2


    }

}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){

    DashboardScreen(rememberNavController())
}