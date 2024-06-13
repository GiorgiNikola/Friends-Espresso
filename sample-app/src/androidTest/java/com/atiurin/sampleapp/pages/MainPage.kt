package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.data.Constants
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object MainPage {
    val dashboard: Matcher<View> by lazy { ViewMatchers.withId(R.id.recycler_friends) }
    val menuBtn: Matcher<View> by lazy { withContentDescription(Constants.MENU_DESCRIPTION) }

    fun returnFriendChat(friendName: String): Matcher<View> {
        val friend: Matcher<View> by lazy {
            Matchers.allOf(
                ViewMatchers.withId(R.id.tv_name),
                ViewMatchers.withText(friendName)
            )
        }
        return friend
    }
}
