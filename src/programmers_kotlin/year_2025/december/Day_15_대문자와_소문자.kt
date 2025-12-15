package programmers_kotlin.year_2025.december

private class Day_15_대문자와_소문자 {
    fun solution(my_string: String): String =
        my_string.map {
            when {
                it.isLowerCase() -> it.uppercaseChar()
                else -> it.lowercaseChar()
            }
        }.joinToString("")
}

fun main() {
    println(Day_15_대문자와_소문자().solution("cccCCC"))
}
