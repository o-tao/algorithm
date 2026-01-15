package programmers_kotlin.year_2026.january

private class Day_15_부분_문자열인지_확인하기 {
    fun solution(my_string: String, target: String) = if (my_string.contains(target)) 1 else 0
}

fun main() {
    println(Day_15_부분_문자열인지_확인하기().solution("banana", "ana"))
}
