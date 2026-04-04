package programmers_kotlin.year_2026.april

private class Day_04_A로_B_만들기 {
    fun solution(before: String, after: String) = if (before.toCharArray().sorted() == after.toCharArray().sorted()) 1 else 0
}

fun main() {
    println(Day_04_A로_B_만들기().solution("olleh", "hello"))
}
