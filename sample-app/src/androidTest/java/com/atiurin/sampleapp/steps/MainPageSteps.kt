package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.MainPage
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.withTimeout
import org.junit.Assert

object MainPageSteps {
    fun dashboardValidation(){
        with(MainPage){
            Assert.assertTrue(dashboard.isViewDisplayed())
        }
    }

    fun openFriendChat(friendName: String){
        with(MainPage){
            returnFriendChat(friendName).withTimeout(2000).click()
        }
    }

    fun openMenu() {
        with(MainPage){
            menuBtn.tap()
        }
    }
}