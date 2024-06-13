package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object MenuPage {
    fun returnItem(itemName: String): Matcher<View> {
        val menuItem: Matcher<View> by lazy {
            Matchers.allOf(
                ViewMatchers.withId(R.id.design_menu_item_text),
                ViewMatchers.withText(itemName)
            )
        }
        return menuItem
    }
}
