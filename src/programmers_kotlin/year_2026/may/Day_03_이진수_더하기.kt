package programmers_kotlin.year_2026.may

private class Day_03_이진수_더하기 {
    fun solution(bin1: String, bin2: String) = Integer.toBinaryString(bin1.toInt(2) + bin2.toInt(2))
}

fun main() {
    println(Day_03_이진수_더하기().solution("10", "11"))
}
