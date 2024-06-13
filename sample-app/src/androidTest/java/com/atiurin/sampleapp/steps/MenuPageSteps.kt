package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.MenuPage

object MenuPageSteps {
    fun openMenuItem(itemName: String) {
        with(MenuPage) {
            returnItem(itemName).tap()
        }
    }
}
