package dev.heemskerk.aoc2020

import java.io.File

object Input {
    fun get(day: Int): List<String> {
        return File("src/main/resources/day$day/input").useLines {
            it.toList()
        }
    }
}