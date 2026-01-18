package programmers_kotlin.year_2026.january

private class Day_18_공백으로_구분하기_2 {
    fun solution(my_string: String) = my_string.trim().split("\\s+".toRegex()).toTypedArray()
}

fun main() {
    println(Day_18_공백으로_구분하기_2().solution(" i    love  you").toList())
}
