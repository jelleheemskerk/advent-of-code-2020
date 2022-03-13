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

    println("In your expense report, what is the product of the three entries that sum to 2020? " +
            "[${Day().solve2(input)}]")
}

class Day {
    fun solve(input: List<Int>) = input.associateWith { it }
            .filter { input.contains(2020 - it.value) }
            .map { it.value }
            .reduce { acc, i -> acc * i }

    fun solve2(input: List<Int>) = 0
}
