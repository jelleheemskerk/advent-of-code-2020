package dev.heemskerk.aoc2020.day1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class DayTest {
    @Test
    internal fun solve() {
        val input = listOf(
            1721,
            979,
            366,
            299,
            675,
            1456,
        )

        assertEquals(expected = 514_579, actual = Day().solve(input))
    }
}