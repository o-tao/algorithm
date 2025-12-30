package programmers_kotlin.year_2025.december

private class Day_30_숫자_찾기 {
    fun solution(num: Int, k: Int): Int {
        val index = num.toString().indexOf(k.toString())
        return if (index == -1) -1 else index + 1
    }
}

fun main() {
    println(Day_30_숫자_찾기().solution(29183, 1))
}
