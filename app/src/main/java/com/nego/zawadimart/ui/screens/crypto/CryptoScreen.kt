package com.nego.zawadimart.ui.screens.crypto

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nego.zawadimart.R
import com.nego.zawadimart.navigation.ROUT_ABOUT
import com.nego.zawadimart.navigation.ROUT_HOME
import com.nego.zawadimart.ui.theme.neOrange
import com.nego.zawadimart.ui.theme.newBlue
import com.nego.zawadimart.ui.theme.newGreen
import com.nego.zawadimart.ui.theme.newOrange
import com.nego.zawadimart.ui.theme.newWhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CryptoScreen(navController: NavController){

//Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {

        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = newWhite
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.DateRange, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.MailOutline, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Profile") },
                    label = { Text("Info") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        navController.navigate(ROUT_HOME)
                    }
                )

            }
        },


        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = newOrange
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }

        },


        //Content

        content = { paddingValues ->

            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize(),
            ) {
                Spacer(modifier = Modifier.height(80.dp))
                Column(
                    modifier = Modifier.padding(start = 20.dp)
                ) {

                    Text(text = "Hi Samantha",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 40.sp


                        )
                    Text(text = "Here are your projects")
                    Spacer(modifier = Modifier.height(30.dp))

                    //Row
                    Row( modifier = Modifier.horizontalScroll(rememberScrollState()) ) {

                        //Card 1
                        Card(
                            modifier = Modifier
                                .width(150.dp)
                                .height(250.dp)
                                .clickable { navController.navigate(ROUT_HOME) }


                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize().background(newBlue),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = "Cryptocurrency", fontSize = 15.sp,)
                                Text(text = "Landing Page", fontSize = 15.sp)
                            }
                        }

                        //End of Card 1

                        Spacer(modifier = Modifier.width(20.dp))

                        //Card 2
                        Card(
                            modifier = Modifier
                                .width(150.dp)
                                .height(250.dp)
                                .clickable { navController.navigate(ROUT_HOME) }


                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize().background(neOrange),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = "Cryptocurrency", fontSize = 15.sp,)
                                Text(text = "Landing Page", fontSize = 15.sp)
                            }
                        }

                        //End of Card 2
                        Spacer(modifier = Modifier.width(20.dp))

                        //Card 2
                        Card(
                            modifier = Modifier
                                .width(150.dp)
                                .height(250.dp)
                                .clickable { navController.navigate(ROUT_HOME) }


                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize().background(newGreen),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = "Cryptocurrency", fontSize = 15.sp,)
                                Text(text = "Landing Page", fontSize = 15.sp)
                            }
                        }

                        //End of Card 2
                    }
                    //End of Row
                }












            }
        }
    )

    //End of scaffold

}

@Preview(showBackground = true)
@Composable
fun CryptoScreenPreview(){

    CryptoScreen(rememberNavController())
}