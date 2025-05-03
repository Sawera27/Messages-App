package com.example.looptalk.ui.presentation.intro.onBoarding

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.looptalk.R
import com.example.looptalk.app.component.CustomOnBoarding
import com.example.looptalk.ui.theme.Blue
import kotlinx.coroutines.launch
import network.chaintech.sdpcomposemultiplatform.sdp

@Composable
fun OnBoardingScreen(navController: NavController) {


    val scope = rememberCoroutineScope()
    var pagerState = rememberPagerState(pageCount = {
        onBoardingItems.size
    }
    )
    Box(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(state = pagerState) { pages ->
            val item = onBoardingItems[pages]
            CustomOnBoarding(item)
        }
        Column(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(80.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Row() {
                    repeat(3) { index ->
                        val color = if (pagerState.currentPage == index) {
                            Color(0xFF2387E0)
                        } else {
                            Color.LightGray
                        }
                        val width = if (pagerState.currentPage == index) 16.sdp else 8.sdp
                        Box(
                            modifier = Modifier
                                .padding(2.sdp)
                                .height(8.dp)
                                .width(width)
                                .clip(CircleShape)
                                .background(color)
                        )
                    }
                }

                Text(
                    text = "Next",
                    color = Blue,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.clickable {
                        if (pagerState.currentPage < 2) {
                            scope.launch {
                                pagerState.scrollToPage(pagerState.currentPage + 1)
                            }
                        }
                    })
            }
        }
    }

}


val onBoardingItems = listOf(
    OnboardingItem(
        R.drawable.first,
        "Messages",
        "Messages app can connect with people everywhere, send SMS, text message without internet connection."
    ),
    OnboardingItem(
        R.drawable.second,
        "Easily Organize",
        "Your message inbox"
    ),
    OnboardingItem(
        R.drawable.third,
        "Secure",
        "Your all message and chat"
    ),
)

data class OnboardingItem(
    val imageRes: Int,
    val title: String,
    val text: String
)
