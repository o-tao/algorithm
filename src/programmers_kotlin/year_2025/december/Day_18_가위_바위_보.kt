package programmers_kotlin.year_2025.december

private class Day_18_가위_바위_보 {
    fun solution(rsp: String): String =
        rsp.map {
            when (it) {
                '2' -> '0'
                '0' -> '5'
                else -> '2'
            }
        }.joinToString("")
}

fun main() {
    println(Day_18_가위_바위_보().solution("2"))
}
