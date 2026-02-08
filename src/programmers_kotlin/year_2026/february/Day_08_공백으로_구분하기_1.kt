package programmers_kotlin.year_2026.february

private class Day_08_공백으로_구분하기_1 {
    fun solution(my_string: String) = my_string.split(" ").toTypedArray()
}

fun main() {
    println(Day_08_공백으로_구분하기_1().solution("i love you").toList())
}
