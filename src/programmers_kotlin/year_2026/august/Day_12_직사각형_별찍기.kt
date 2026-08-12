package programmers_kotlin.year_2026.august

private class Day_12_직사각형_별찍기

fun main(args: Array<String>) {
    val (n, m) = readln().split(" ").map { it.toInt() }

    repeat(m) { println("*".repeat(n)) }
}
