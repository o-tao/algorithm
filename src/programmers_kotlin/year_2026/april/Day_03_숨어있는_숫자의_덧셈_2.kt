package programmers_kotlin.year_2026.april

private class Day_03_숨어있는_숫자의_덧셈_2 {
    fun solution(my_string: String): Int {
        return Regex("\\d+")
            .findAll(my_string)
            .sumOf { it.value.toInt() }
    }
}

fun main() {
    println(Day_03_숨어있는_숫자의_덧셈_2().solution("aAb1B2cC34oOp"))
}
