package programmers_kotlin.year_2025.december

class Day_16_숨어있는_숫자의_덧셈_1 {
    fun solution(my_string: String): Int = my_string.filter { it.isDigit() }.sumOf { it - '0' }
}

fun main() {
    println(Day_16_숨어있는_숫자의_덧셈_1().solution("aAb1B2cC34oOp"))
}
