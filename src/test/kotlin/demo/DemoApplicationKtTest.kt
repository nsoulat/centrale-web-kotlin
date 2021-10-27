package demo

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DemoApplicationKtTest {

    @Test
    fun testWorking() {
        val expected = 42
        assertEquals(expected, 42)
    }

    @Test
    fun test2() {
        val expected = true
        assertTrue(expected)
    }
}