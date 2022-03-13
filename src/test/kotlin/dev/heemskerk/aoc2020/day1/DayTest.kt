package dev.heemskerk.aoc2020.day1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class DayTest {
    private val input = listOf(
        1721,
        979,
        366,
        299,
        675,
        1456,
    )

    @Test
    internal fun solve() {
        assertEquals(expected = 514_579, actual = Day().solve(input))
    }

    @Test
    internal fun solve2() {
        assertEquals(expected = 241_861_950, actual = Day().solve(input))
    }
}
