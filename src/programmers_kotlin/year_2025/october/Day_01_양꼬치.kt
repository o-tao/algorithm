package programmers_kotlin.year_2025.october

private class Day_01_양꼬치 {
    fun solution(n: Int, k: Int) = (n * 12000) + ((k - (n / 10)) * 2000)
}

fun main() {
    println(Day_01_양꼬치().solution(10, 3))
}
