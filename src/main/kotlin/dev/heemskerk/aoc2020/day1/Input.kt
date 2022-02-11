package dev.heemskerk.aoc2020.day1

import java.io.File

object Input {
    fun get(day: Int): List<Any> {
        return File("src/main/resources/day$day/input").useLines {
            it.toList()
        }
    }
}