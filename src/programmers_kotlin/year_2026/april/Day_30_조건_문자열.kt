package programmers_kotlin.year_2026.april

private class Day_30_조건_문자열 {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        return when {
            ineq == ">" && eq == "=" -> if (n >= m) 1 else 0
            ineq == "<" && eq == "=" -> if (n <= m) 1 else 0
            ineq == ">" && eq == "!" -> if (n > m) 1 else 0
            ineq == "<" && eq == "!" -> if (n < m) 1 else 0
            else -> 0
        }
    }
}

fun main() {
    println(Day_30_조건_문자열().solution("<", "=", 20, 50))
}
