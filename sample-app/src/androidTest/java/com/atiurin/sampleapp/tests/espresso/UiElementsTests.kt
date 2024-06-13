package com.atiurin.sampleapp.tests.espresso

import com.atiurin.sampleapp.data.Constants
import com.atiurin.sampleapp.steps.MainPageSteps
import com.atiurin.sampleapp.steps.MenuPageSteps
import com.atiurin.sampleapp.steps.UiElementsPageSteps
import org.junit.Test

class UiElementsTests : BaseTest() {

    @Test
    fun invisibleBtnTest() {
        with(Constants) {
            with(MainPageSteps) {
                dashboardValidation()
                openMenu()
            }
            with(MenuPageSteps) {
                openMenuItem(UI_ELEMENTS)
            }
            with(UiElementsPageSteps) {
                validateUiElementsOpened()
                clickBtn(ENABLE_BTN)
                clickBtn(CLICKABLE_BTN)
                validateBtnNotEnabled()
                validateBtnNotClickable()
                clickBtn(INVISIBLE_BTN)
                validateBtnInvisible()
            }
        }
    }

    @Test
    fun clicksTest() {
        with(Constants) {
            with(MainPageSteps) {
                dashboardValidation()
                openMenu()
            }
            with(MenuPageSteps) {
                openMenuItem(UI_ELEMENTS)
            }
            with(UiElementsPageSteps) {
                validateUiElementsOpened()
                for (i in ZERO until CLICK_COUNT) {
                    clickBtn(SIMPLE_BTN)
                }
                validateClickCount(CLICK_COUNT)
                clickBtn(INVISIBLE_BTN)
                validateBtnInvisible()
            }
        }
    }
}
