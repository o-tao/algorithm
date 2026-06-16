package programmers_kotlin.year_2026.june

private class Day_16_분수의_덧셈 {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        val numerator = numer1 * denom2 + numer2 * denom1
        val denominator = denom1 * denom2

        var a = numerator
        var b = denominator

        while (b != 0) {
            val temp = b
            b = a % b
            a = temp
        }

        return intArrayOf(numerator / a, denominator / a)
    }
}

fun main() {
    println(Day_16_분수의_덧셈().solution(1, 2, 3, 4).contentToString())
}
