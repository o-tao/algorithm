package programmers_kotlin.year_2026.march

private class Day_16_중복된_문자_제거 {
    fun solution(my_string: String) = my_string.toList().distinct().joinToString("")
}

fun main() {
    println(Day_16_중복된_문자_제거().solution("people"))
}
