package com.developer753.news753.ui.model

import androidx.annotation.DrawableRes
import com.developer753.news753.R

data class OnboardingPage (
    val title:String,
    val description:String,
    @DrawableRes val image:Int
)
object onBoardingPages {
    val onboardingPageList = listOf<OnboardingPage>(
        OnboardingPage(
            title = "Explore New Places",
            description = "Welcome to R.E.A, your go-to platform for discovering homes and office spaces in and around your neighborhood. Whether you're looking to rent, find your dream home for purchase, or looking for office space we've got you covered. Discover the possibilities of living local with R.E.A",
            R.drawable.sapiens__3_
        ),
        OnboardingPage(
            image = R.drawable.sapiens__4_,
            title = "Tailored to Your Tastes",
            description = "Discover homes that match your lifestyle on R.E.A. Our intuitive search and recommendation features help you find the perfect place that aligns with your preferences. From vibrant urban lofts to serene suburban homes, your ideal dwelling is just a few taps away. Let's find your next home, uniquely suited to your tastes."
        ),
        OnboardingPage(
            image = R.drawable.sapiens__5_,
            title = "Your New Space in a Flash",
            description = "Experience the speed of R.E.A in finding your ideal living space. Our platform is designed for efficiency, helping you discover and secure what your looking for in record time. No more endless searches – with R.E.A, your dream home is just a few clicks away. Say goodbye to the wait and hello to swift home solutions tailored to your needs."
        )
    )
}