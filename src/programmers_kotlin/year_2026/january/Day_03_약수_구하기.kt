package programmers_kotlin.year_2026.january

private class Day_04_약수_구하기 {
    fun solution(n: Int): IntArray = (1..n).filter { n % it == 0 }.toIntArray()
}

fun main() {
    println(Day_04_약수_구하기().solution(24).toList())
}
