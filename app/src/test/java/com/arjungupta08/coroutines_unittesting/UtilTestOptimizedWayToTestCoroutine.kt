package com.arjungupta08.coroutines_unittesting

import kotlinx.coroutines.test.runTest
import org.junit.Assert
import org.junit.Rule
import org.junit.Test

class UtilTestOptimizedWayToTestCoroutine {

    // This is an optimized way to write Test Cases for Coroutines using MainCoroutineRule

    @get:Rule
    val mainCoroutineRule = MainCoroutineRule()

    @Test
    fun testGetUser() {
        val sut = Util(mainCoroutineRule.testDispatcher)
        runTest {
            sut.getAddress()
            mainCoroutineRule.testDispatcher.scheduler.advanceUntilIdle()
            Assert.assertEquals(true, sut.globalArg)
        }
    }
}