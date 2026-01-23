package programmers_kotlin.year_2026.january

private class Day_23_x_사이의_개수 {
    fun solution(myString: String) = myString.split("x").map { it.length }.toIntArray()
}

fun main() {
    println(Day_23_x_사이의_개수().solution("oxooxoxxox").toList())
}
