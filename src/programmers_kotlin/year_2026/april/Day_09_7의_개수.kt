package programmers_kotlin.year_2026.april

private class Day_09_7의_개수 {
    fun solution(array: IntArray) = array.sumOf { num -> num.toString().count { it == '7' } }
}

fun main() {
    println(Day_09_7의_개수().solution(intArrayOf(7, 77, 17)))
}
