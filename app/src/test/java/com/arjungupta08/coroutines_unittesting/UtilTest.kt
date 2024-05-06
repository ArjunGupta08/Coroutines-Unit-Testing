package com.arjungupta08.coroutines_unittesting

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test


class UtilTest {

    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
    }

    @Test
    fun testUserName() {
        // Arrange
        val sut = Util(testDispatcher)
        //Act
        runTest {
            sut.getUserName()
        }
    }

    @Test
    fun testUser() {
        val sut = Util(testDispatcher)
        runTest {
            sut.getUser()
        }
    }



    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }
}