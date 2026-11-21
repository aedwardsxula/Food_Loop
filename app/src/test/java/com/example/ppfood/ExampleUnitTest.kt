package com.example.ppfood

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun testSampleStores() {
        assertEquals(3, sampleStores.size)
        assertEquals("Rouses Market", sampleStores[0].name)
        assertEquals("701 St Charles Ave, New Orleans", sampleStores[0].address)
        assertEquals("LA", sampleStores[0].state)
    }
}