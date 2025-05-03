package com.example.looptalk.app.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.looptalk.ui.presentation.intro.onBoarding.OnboardingItem


@Composable
fun CustomOnBoarding(item: OnboardingItem) {
    Column(
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxSize()
            .background(Color.White)
            .padding(vertical = 24.dp, horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = item.imageRes), contentDescription = "")
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            item.title, fontWeight = FontWeight.Bold,
            fontSize = 20.sp, color = Color.Black,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            item.text,
            fontSize = 18.sp, color = Color.Black,
            textAlign = TextAlign.Center
        )
    }
}