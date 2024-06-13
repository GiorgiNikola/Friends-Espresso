package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import com.atiurin.ultron.core.espresso.recyclerview.withRecyclerView
import org.hamcrest.Matcher

object ChatPage {
    val messagesList = withRecyclerView(R.id.messages_list)
    val inputMessageText: Matcher<View> = ViewMatchers.withId(R.id.message_input_text)
    val sendMessageBtn: Matcher<View> = ViewMatchers.withId(R.id.send_button)
    val friendNameDisplayed: Matcher<View> = ViewMatchers.withId(R.id.toolbar_title)
}
