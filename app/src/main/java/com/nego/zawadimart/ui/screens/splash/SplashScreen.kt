package com.nego.zawadimart.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nego.zawadimart.R
import com.nego.zawadimart.navigation.ROUT_START
import com.nego.zawadimart.ui.theme.newOrange
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(@SuppressLint("CoroutineCreationDuringComposition") navController: NavController){

    //Navigation

    val coroutine = rememberCoroutineScope()
    coroutine.launch {
        delay(2000)
        navController.navigate(ROUT_START)

    }

    //End of Navigation

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(newOrange),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(R.drawable.product),
            contentDescription = "",
            modifier = Modifier.size(300.dp)
        )


    }

}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){

    SplashScreen(rememberNavController())
}