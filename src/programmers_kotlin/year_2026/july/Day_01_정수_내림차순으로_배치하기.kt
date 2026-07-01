package programmers_kotlin.year_2026.july

class Day_01_정수_내림차순으로_배치하기 {
    fun solution(n: Long) = n.toString().toCharArray().sortedDescending().joinToString("").toLong()
}

fun main() {
    println(Day_01_정수_내림차순으로_배치하기().solution(118372))
}
