package programmers_kotlin.year_2026.march

private class Day_05_세로_읽기 {
    fun solution(my_string: String, m: Int, c: Int) =
        my_string.indices
            .filter { it % m == c - 1 }
            .map { my_string[it] }
            .joinToString("")
}

fun main() {
    println(Day_05_세로_읽기().solution("ihrhbakrfpndopljhygc", 4, 2))
}
