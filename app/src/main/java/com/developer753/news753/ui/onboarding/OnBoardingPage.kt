package com.developer753.news753.ui.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.developer753.news753.R
import com.developer753.news753.ui.Dimens
import com.developer753.news753.ui.model.OnboardingPage
import com.developer753.news753.ui.model.onBoardingPages

@Composable
fun OnBoardingPage(modifier: Modifier=Modifier,page: OnboardingPage){
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Spacer(modifier = Modifier.height(Dimens.mediumPadding2))
        Column(modifier= Modifier
            .fillMaxWidth()
            .height(Dimens.mediumHeight2)) {
            Image(modifier = modifier.fillMaxSize(), painter = painterResource(id = page.image), contentScale = ContentScale.Crop, contentDescription = page.title)
        }
        Column(modifier=Modifier.fillMaxWidth()) {
            Row(modifier=Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                Text(text = page.title, fontFamily = FontFamily(Font(R.font.poppins_bold)), style = MaterialTheme.typography.bodyLarge)
            }
            Spacer(modifier = Modifier.height(Dimens.smallPadding))
            Row(modifier=Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                Text(modifier=Modifier.padding(Dimens.smallPadding),text = page.description, fontFamily = FontFamily(Font(R.font.poppins_light)), textAlign = TextAlign.Justify)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun OnBoardingPagePreview(){
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

        OnBoardingPage(page = onBoardingPages.onboardingPageList[2])
    }
}