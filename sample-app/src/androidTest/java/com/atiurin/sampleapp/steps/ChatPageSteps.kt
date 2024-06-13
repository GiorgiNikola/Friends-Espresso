package com.atiurin.sampleapp.steps

import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.pages.ChatPage
import com.atiurin.ultron.core.espresso.recyclerview.UltronRecyclerViewItem
import com.atiurin.ultron.custom.espresso.action.getText
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.typeText
import org.junit.Assert

object ChatPageSteps {
    fun validateCorrectChatOpened(friendName: String) {
        with(ChatPage) {
            Assert.assertEquals(friendName, friendNameDisplayed.getText())
        }
    }

    fun inputMessage(message: String) {
        with(ChatPage) {
            inputMessageText.typeText(message)
        }
    }

    fun sendMessage() {
        with(ChatPage) {
            sendMessageBtn.tap()
        }
    }

    private fun getListItemAtPosition(position: Int): ChatRecyclerItem {
        with(ChatPage) {
            return messagesList.getItem(position)
        }
    }

    class ChatRecyclerItem : UltronRecyclerViewItem() {
        val text by lazy { getChild(ViewMatchers.withId(R.id.message_text)) }
    }

    fun validateLastMessage(expectedMessage: String) = apply {
        with(ChatPage) {
            val actualMessage = getListItemAtPosition(messagesList.getSize() - 1).text.getText()
            Assert.assertEquals(expectedMessage, actualMessage)
        }
    }
}
