package programmers_kotlin.year_2025.september

private class Day_22_숫자_비교하기 {
    fun solution(num1: Int, num2: Int): Int {
        return if (num1 == num2) 1 else -1
    }
}

fun main() {
    println(Day_22_숫자_비교하기().solution(2, 3))
}
