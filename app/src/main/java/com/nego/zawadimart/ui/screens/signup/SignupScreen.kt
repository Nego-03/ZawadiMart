package com.nego.zawadimart.ui.screens.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nego.zawadimart.navigation.ROUT_DASHBOARD
import com.nego.zawadimart.ui.theme.newNavy
import com.nego.zawadimart.ui.theme.newOrange
import com.nego.zawadimart.ui.theme.newWhite

@Composable
fun SignupScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize().background(newNavy)
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

                    Spacer(modifier = Modifier.height(10.dp))

                    //Variables
                    var username by remember { mutableStateOf("") }
                    var password by remember { mutableStateOf("") }

                    //Username
                    OutlinedTextField(value = username,
                        onValueChange = {  username = it  },
                        modifier = Modifier.fillMaxWidth().padding(start = 20.dp,end = 20.dp),
                        label = { Text(text = "Username", modifier = Modifier.padding(start = 100.dp)) },
                        shape = RoundedCornerShape(30.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Color.Black,
                            focusedBorderColor = Color.Gray
                        ),

                    )
                    //End

                    Spacer(modifier = Modifier.height(10.dp))

                    //Password
                    OutlinedTextField(value = password,
                        onValueChange = {  password = it  },
                        modifier = Modifier.fillMaxWidth().padding(start = 20.dp,end = 20.dp),
                        label = { Text(text = "Password", modifier = Modifier.padding(start = 100.dp)) },
                        shape = RoundedCornerShape(30.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        visualTransformation = PasswordVisualTransformation(),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Color.Black,
                            focusedBorderColor = Color.Gray
                        ),

                    )
                    //End

                    Spacer(modifier = Modifier.height(10.dp))

                    Button(
                        onClick = {
                            navController.navigate(ROUT_DASHBOARD)
                        },
                        colors = ButtonDefaults.buttonColors(newOrange),
                        shape = RoundedCornerShape(30.dp),
                        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)

                    ) {
                        Text(text = "Sign Up")
                    }
                    Text(text = "Already are members? Log in")




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