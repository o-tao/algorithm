package programmers_kotlin.year_2026.january

private class Day_11_0_떼기 {
    fun solution(n_str: String) = n_str.dropWhile { it == '0' }
}

fun main() {
    println(Day_11_0_떼기().solution("0010"))
}
