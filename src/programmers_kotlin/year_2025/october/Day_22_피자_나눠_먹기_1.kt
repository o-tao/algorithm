package programmers_kotlin.year_2025.october

private class Day_22_피자_나눠_먹기_1 {
    fun solution(n: Int): Int {
        return when {
            n % 7 == 0 -> n / 7
            else -> (n / 7) + 1
        }
    }
}

fun main() {
    println(Day_22_피자_나눠_먹기_1().solution(7))
}
