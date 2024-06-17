package com.atiurin.sampleapp.tests.espresso

import com.atiurin.sampleapp.data.Constants
import com.atiurin.sampleapp.steps.MainPageSteps
import org.junit.Test

class WeekendVibeTests : MyBaseTest() {

    @Test
    fun scrollOpenChatTest1() {
        with(Constants) {
            with(MainPageSteps) {
                scrollToFriend(EMMET_BROWN)
                openFriendChat(EMMET_BROWN)
            }
            weekendVibeTestsCommonSteps(EMMET_BROWN, LETS_DRINK)
        }
    }

    @Test
    fun scrollOpenChatTest2() {
        with(Constants) {
            with(MainPageSteps) {
                swipeToFriend(FRIEND17, 300, 175)
                openFriendChat(FRIEND17)
            }
            weekendVibeTestsCommonSteps(FRIEND17, CHANGE_NAME)
        }
    }

    @Test
    fun scrollToNonExistentFriend() {
        with(Constants) {
            with(MainPageSteps) {
                swipeToFriend(FRIEND25, 300, 150)
                openFriendChat(FRIEND25)
            }
            weekendVibeTestsCommonSteps(FRIEND25, HERO_TEXT)
        }
    }
}
