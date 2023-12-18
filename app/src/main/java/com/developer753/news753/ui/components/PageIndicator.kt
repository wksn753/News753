package com.developer753.news753.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.developer753.news753.ui.Dimens

@Composable
fun PageIndicator(modifier: Modifier=Modifier,numberOfPages:Int,selectedPageColor: Color,unSelectedPageColor: Color,currentPage:Int){
    Row(modifier = modifier, horizontalArrangement = Arrangement.SpaceBetween) {
        repeat(numberOfPages){
            page->
            Box(modifier = Modifier
                .size(Dimens.indicatorSize)
                .clip(CircleShape)
                .background(if (currentPage == page) selectedPageColor else unSelectedPageColor))
            Spacer(modifier = Modifier.width(Dimens.smallPadding))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PageIndicatorPreview(){
    PageIndicator(
        numberOfPages = 5,
        selectedPageColor = Color(0XFF39AFEA),
        unSelectedPageColor = Color.Gray,
        currentPage = 1
    )
}