package programmers_kotlin.year_2026.february

private class Day_07_rny_string {
    fun solution(rny_string: String) = rny_string.replace("m", "rn")
}

fun main() {
    println(Day_07_rny_string().solution("masterpiece"))
}
