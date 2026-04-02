package programmers_kotlin.year_2026.april

private class Day_02_팩토리얼 {
    fun solution(n: Int): Int {
        var factorial = 1

        for (i in 1..10) {
            factorial *= i
            if (factorial > n) {
                return i - 1
            }
        }

        return 10
    }
}

fun main() {
    println(Day_02_팩토리얼().solution(3628800))
}
