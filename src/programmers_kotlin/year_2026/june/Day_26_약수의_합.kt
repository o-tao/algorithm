package programmers_kotlin.year_2026.june

private class Day_26_약수의_합 {
    fun solution(n: Int) = (1..n).filter { n % it == 0 }.sum()
}

fun main() {
    println(Day_26_약수의_합().solution(12))
}
