package programmers_kotlin.year_2026.august

private class Day_24_3진법_뒤집기 {
    fun solution(n: Int) = n.toString(3).reversed().toInt(3)
}

fun main() {
    println(Day_24_3진법_뒤집기().solution(45))
}
