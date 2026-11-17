package programmers_kotlin.year_2026.nobemver

import kotlin.math.abs

private class Day_17_거리두기_확인하기 {
    fun solution(places: Array<Array<String>>): IntArray =
        places.map { room -> if (isSafe(room)) 1 else 0 }.toIntArray()

    private fun isSafe(room: Array<String>): Boolean {
        val people = (0 until 5).flatMap { r ->
            (0 until 5).filter { c -> room[r][c] == 'P' }.map { c -> r to c }
        }

        for (a in people.indices) {
            for (b in a + 1 until people.size) {
                if (!isDistanced(room, people[a], people[b])) return false
            }
        }
        return true
    }

    private fun isDistanced(room: Array<String>, p1: Pair<Int, Int>, p2: Pair<Int, Int>): Boolean {
        val (r1, c1) = p1
        val (r2, c2) = p2
        val distance = abs(r1 - r2) + abs(c1 - c2)

        return when {
            distance > 2 -> true
            distance == 1 -> false
            r1 == r2 -> room[r1][(c1 + c2) / 2] == 'X'
            c1 == c2 -> room[(r1 + r2) / 2][c1] == 'X'
            else -> room[r1][c2] == 'X' && room[r2][c1] == 'X'
        }
    }
}

fun main() {
    println(
        Day_17_거리두기_확인하기().solution(
            arrayOf(
                arrayOf("POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"),
                arrayOf("POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"),
                arrayOf("PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"),
                arrayOf("OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"),
                arrayOf("PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP")
            )
        ).contentToString()
    )
}
