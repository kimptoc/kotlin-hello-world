package sample

import org.junit.Assert.*
import org.junit.Test

class HelloWorldKotlinTest {

    @Test
    fun basics() {
        val sut = HelloWorldKotlin()
        assertEquals("Hello from Kotlin", sut.go())
    }
}
