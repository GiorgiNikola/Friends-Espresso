package com.atiurin.sampleapp.tests.espresso

import com.atiurin.sampleapp.data.Constants
import com.atiurin.sampleapp.pages.CustomClicksPage
import com.atiurin.sampleapp.steps.ChatPageSteps
import com.atiurin.sampleapp.steps.CustomClicksPageSteps
import com.atiurin.sampleapp.steps.MainPageSteps
import com.atiurin.sampleapp.steps.MenuPageSteps
import org.junit.Test

class GreetingTests : MyBaseTest() {

    @Test
    fun textingTest() {
        with(Constants) {
            with(MainPageSteps) {
                dashboardValidation()
                openFriendChat(RACHEL)
            }
            with(ChatPageSteps) {
                validateCorrectChatOpened(RACHEL)
                inputMessage(MESSAGE)
                sendMessage()
                validateLastMessage(MESSAGE)
            }
        }
    }

    @Test
    fun customClicksTest() {
        with(Constants) {
            with(MainPageSteps) {
                dashboardValidation()
                openMenu()
            }
            with(MenuPageSteps) {
                openMenuItem(CUSTOM_CLICKS)
            }
            with(CustomClicksPageSteps) {
                validateCustomClicks()
                with(CustomClicksPage) {
                    clickCircle(topLeftCircle)
                    clickCircle(topRightCircle)
                    clickCircle(bottomLeftCircle)
                    clickCircle(bottomRightCircle)

                    validateCircleMarked(topLeftCircle)
                    validateCircleMarked(topRightCircle)
                    validateCircleMarked(bottomLeftCircle)
                    validateCircleMarked(bottomRightCircle)
                }
            }
        }
    }
}
