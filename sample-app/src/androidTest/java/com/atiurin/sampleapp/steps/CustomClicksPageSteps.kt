package com.atiurin.sampleapp.steps

import android.view.View
import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.CustomClicksPage
import org.hamcrest.Matcher
import org.junit.Assert

object CustomClicksPageSteps {
    fun validateCustomClicks(){
        with(CustomClicksPage){
            Assert.assertTrue(bottomRightCircle.isViewDisplayed())
        }
    }

    fun clickCircle(circle: Matcher<View>) {
        circle.tap()
    }

    fun validateCircleMarked(circle: Matcher<View>){
        Assert.assertTrue(circle.isChecked())
    }
}