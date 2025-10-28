package programmers_kotlin.year_2025.october

private class Day_28_배열_자르기 {
    fun solution(numbers: IntArray, num1: Int, num2: Int) = numbers.sliceArray(num1..num2)
}

fun main() {
    println(Day_28_배열_자르기().solution(intArrayOf(1, 2, 3, 4, 5), 1, 3).contentToString())
}
