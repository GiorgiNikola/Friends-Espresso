package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.data.Constants
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.UiElementsPage
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.isNotClickable
import com.atiurin.ultron.extensions.isNotDisplayed
import com.atiurin.ultron.extensions.isNotEnabled
import com.atiurin.ultron.extensions.textContains

object UiElementsPageSteps {
    fun validateUiElementsOpened() {
        with(UiElementsPage) {
            simpleBtn.isDisplayed()
        }
    }

    fun clickBtn(buttonName: String) {
        with(UiElementsPage) {
            returnBtn(buttonName).tap()
        }
    }

    fun validateBtnNotEnabled() {
        with(UiElementsPage) {
            simpleBtn.isNotEnabled()
        }
    }

    fun validateBtnNotClickable() {
        with(UiElementsPage) {
            simpleBtn.isNotClickable()
        }
    }

    fun validateBtnInvisible() {
        with(UiElementsPage) {
            simpleBtn.isNotDisplayed()
        }
    }

    fun validateClickCount(count: Int) {
        with(UiElementsPage) {
            with(Constants) {
                lastEventStatus.textContains(CLICK + count)
            }
        }
    }
}
