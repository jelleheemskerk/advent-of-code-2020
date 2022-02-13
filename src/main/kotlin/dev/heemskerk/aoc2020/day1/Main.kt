package dev.heemskerk.aoc2020.day1

import dev.heemskerk.aoc2020.Input

/**
 * https://adventofcode.com/2020/day/1
 */
fun main() {
    val input = Input.get(day = 1).map {
        it.toInt()
    }

    println("Find the two entries that sum to 2020; what do you get if you multiply them together? " +
            "[${Day().solve(input)}]")
}

class Day {
    fun solve(input: List<Int>): Int {
        return input.associateWith { it }
            .filter { input.contains(2020 - it.value) }
            .map { it.value }
            .reduce { acc, i -> acc * i }
    }
}