package programmers_kotlin.year_2025.october

private class Day_17_짝수의_합 {
    fun solution(n: Int) = (0..n).filter { it % 2 == 0 }.sum()
}

fun main() {
    println(Day_17_짝수의_합().solution(10))
}
