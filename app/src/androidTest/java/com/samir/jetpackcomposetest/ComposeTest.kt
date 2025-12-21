package com.samir.jetpackcomposetest

import androidx.compose.ui.Modifier
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollToNode
import org.junit.Rule
import org.junit.Test


class ComposeTest {
    val list = listOf("Alice", "Bob", "Katrina","Alice", "Bob", "Katrina","Alice", "Bob", "Katrina","Alice", "Bob", "Katrina","Alice", "Bob", "Katrina","Alice", "Bob", "Katrina","Alice", "Bob", "Katrina","Alice", "Bob", "Katrina","Alice", "Bob", "Katrina","Alice", "Bob", "Katrina","Alice", "Bob", "Katrina","Alice", "Bob", "Katrina","Alice", "Bob", "Katrina", "Jack", "John")


    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun test() {

        composeTestRule.setContent {
            ListOfUsers(users = list, modifier = Modifier)
        }
        composeTestRule.onNodeWithTag("user_list").performScrollToNode(hasText("Jack"))

        composeTestRule.onNodeWithTag("user_Jack").performClick()

    }
}