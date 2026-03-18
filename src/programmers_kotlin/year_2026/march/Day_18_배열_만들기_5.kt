package programmers_kotlin.year_2026.march

private class Day_18_배열_만들기_5 {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int) = intStrs.map { it.substring(s, s + l).toInt() }.filter { it > k }.toIntArray()
}

fun main() {
    println(Day_18_배열_만들기_5().solution(arrayOf("0123456789", "9876543210", "9999999999999"), 50000, 5, 5).toList())
}
