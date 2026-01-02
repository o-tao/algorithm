package programmers_kotlin.year_2026.january

private class Day_02_인덱스_바꾸기 {
    fun solution(my_string: String, num1: Int, num2: Int) =
        my_string.mapIndexed { index, c ->
            when (index) {
                num1 -> my_string[num2]
                num2 -> my_string[num1]
                else -> c
            }
        }.joinToString("")
}

fun main() {
    println(Day_02_인덱스_바꾸기().solution("hello", 1, 2))
}
