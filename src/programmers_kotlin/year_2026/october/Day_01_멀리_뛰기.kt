package programmers_kotlin.year_2026.october

private class Day_01_멀리_뛰기 {
    fun solution(n: Int): Long {
        var a = 1L
        var b = 2L
        if (n == 1) return a

        repeat(n - 2) {
            val next = (a + b) % 1234567
            a = b
            b = next
        }
        return b
    }
}

fun main() {
    println(Day_01_멀리_뛰기().solution(4))
}
