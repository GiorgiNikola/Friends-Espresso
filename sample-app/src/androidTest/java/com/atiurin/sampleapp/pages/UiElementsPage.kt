package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object UiElementsPage {
    val simpleBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.button1) }
    val lastEventStatus: Matcher<View> by lazy { ViewMatchers.withId(R.id.last_event_status) }

    fun returnBtn(btnName: String): Matcher<View> {
        val btn: Matcher<View> by lazy {
            ViewMatchers.withText(btnName)
        }
        return btn
    }
}
