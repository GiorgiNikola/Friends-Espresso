package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object CustomClicksPage {
    val topLeftCircle: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_top_left) }
    val topRightCircle: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_top_right) }
    val bottomLeftCircle: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_bottom_left) }
    val bottomRightCircle: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_bottom_right) }
}
