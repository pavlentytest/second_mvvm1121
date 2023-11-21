package com.example.myapplication

import org.junit.Assert.*

import org.junit.After
import org.junit.Assert
import org.junit.Assume
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    var calc: Calculator? = null

    @Before
    fun setUpadfgafgafd() {
        calc = Calculator()
    }

    @After
    fun tearDownadfgadfgadf() {
        calc = null
    }

    @Test
    fun calcsdfgsdfgsdf() {
        // Assert => exception
       // Assume => ignore (Без исключения и ошибки)
        Assert.assertEquals(100, calc?.calc(4,5) ?: 0)
    }

    @Test
    fun test2() {
        Assert.assertEquals(100, calc?.calc(40,60) ?: 0)
    }

    @Test
    fun test3() {
        Assume.assumeNotNull(4,5,2,2,3, null)
    }

    @Test(expected = NullPointerException::class)
    fun test4() {
        Assert.assertTrue(calc?.getLength("null") ?: true)
    }


}