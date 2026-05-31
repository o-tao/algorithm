package programmers_kotlin.year_2026.may

private class Day_31_유한소수_판별하기 {
    fun solution(a: Int, b: Int): Int {
        var x = a
        var y = b

        while (y != 0) {
            x = y.also { y = x % y }
        }

        var d = b / x

        while (d % 2 == 0) d /= 2
        while (d % 5 == 0) d /= 5

        return if (d == 1) 1 else 2
    }
}

fun main() {
    println(Day_31_유한소수_판별하기().solution(7, 20))
}
