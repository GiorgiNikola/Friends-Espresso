package com.atiurin.sampleapp.tests.espresso

import com.atiurin.sampleapp.data.Constants
import org.junit.Test

class WeekendVibeTests : MyBaseTest() {

    @Test
    fun scrollOpenChatTest1() {
        with(Constants) {
            weekendVibeTestsSetup(EMMET_BROWN, LETS_DRINK, 300, 255)
        }
    }

    @Test
    fun scrollOpenChatTest2() {
        with(Constants) {
            weekendVibeTestsSetup(FRIEND17, CHANGE_NAME, 300, 175)
        }
    }

    @Test
    fun scrollToNonExistentFriend() {
        with(Constants) {
            weekendVibeTestsSetup(FRIEND25, HERO_TEXT, 300, 200)
        }
    }
}
