package programmers_kotlin.year_2026.july

private class Day_09_나머지가_1이_되는_수_찾기 {
    fun solution(n: Int) = (1 until n).first { n % it == 1 }
}

fun main() {
    println(Day_09_나머지가_1이_되는_수_찾기().solution(10))
}
