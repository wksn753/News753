package com.developer753.news753.ui.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.developer753.news753.ui.Dimens
import com.developer753.news753.ui.components.Btn
import com.developer753.news753.ui.components.PageIndicator
import com.developer753.news753.ui.model.OnboardingPage
import com.developer753.news753.ui.model.onBoardingPages
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen(modifier: Modifier=Modifier){
    val onboardingPagerSate= rememberPagerState(
        pageCount = {onBoardingPages.onboardingPageList.size}
    )
    val buttonState by remember{
        derivedStateOf {
            when(onboardingPagerSate.currentPage){
                0-> listOf("","Next")
                1-> listOf("Back","Next")
                2-> listOf("Back","Continue")
                else-> listOf("","")
            }
        }
    }
    val onboardingScope= rememberCoroutineScope()
    Column(modifier=modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(Dimens.smallHeight))
        HorizontalPager(state = onboardingPagerSate) {
            page -> OnBoardingPage(page = onBoardingPages.onboardingPageList[page])
        }
        Spacer(modifier = Modifier.height(Dimens.smallHeight2))
        Row(modifier=Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween){
            PageIndicator(
                numberOfPages = onBoardingPages.onboardingPageList.size,
                selectedPageColor = Color(0xFF39AFEA),
                unSelectedPageColor = Color.DarkGray,
                currentPage = onboardingPagerSate.currentPage
            )
            Row {
                TextButton(onClick = { if (onboardingPagerSate.currentPage!=0){onboardingScope.launch { onboardingPagerSate.animateScrollToPage(page=onboardingPagerSate.currentPage-1) }} }) {
                    Text(text = buttonState[0])
                }
                Btn(text=buttonState[1], onClick = {if (onboardingPagerSate.currentPage!=2){onboardingScope.launch { onboardingPagerSate.animateScrollToPage(page=onboardingPagerSate.currentPage+1) }} })
            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun OnboardingScreenPreview(){
    Column(modifier = Modifier) {
        OnboardingScreen()
    }
}