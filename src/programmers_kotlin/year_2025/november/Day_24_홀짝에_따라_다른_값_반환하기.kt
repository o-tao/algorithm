package programmers_kotlin.year_2025.november

private class Day_24_홀짝에_따라_다른_값_반환하기 {
    fun solution(n: Int): Int = when (n % 2) {
        1 -> (1..n step 2).sum()
        else -> (2..n step 2).sumOf { it * it }
    }
}

fun main() {
    println(Day_24_홀짝에_따라_다른_값_반환하기().solution(7))
}
