package programmers_kotlin.year_2026.september

private class Day_25_최댓값과_최솟값 {
    fun solution(s: String): String {
        val nums = s.split(" ").map { it.toInt() }.sorted()
        return "${nums.first()} ${nums.last()}"
    }
}

fun main() {
    println(Day_25_최댓값과_최솟값().solution("1 2 3 4"))
}
