package programmers_kotlin.year_2025.december

private class Day_03_두_수의_연산값_비교하기 {
    fun solution(a: Int, b: Int): Int {
        val concat = (a.toString() + b.toString()).toInt()
        val product = 2 * a * b
        return if (concat >= product) concat else product
    }
}

fun main() {
    println(Day_03_두_수의_연산값_비교하기().solution(2, 91))
}
