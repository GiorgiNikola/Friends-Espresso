package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.steps.ChatPageSteps
import com.atiurin.sampleapp.steps.MainPageSteps
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
open class MyBaseTest {
    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    fun weekendVibeTestsSetup(friendName: String, message: String, start: Int, end: Int) {
        with(MainPageSteps) {
            // ეს ფუნქციაც მუშაობს
            // scrollToFriend(friendName)
            swipeToFriend(friendName, start, end)
            openFriendChat(friendName)
        }
        with(ChatPageSteps) {
            validateCorrectChatOpened(friendName)
            inputMessage(message)
            sendMessage()
            validateLastMessage(message)
        }
    }
}
