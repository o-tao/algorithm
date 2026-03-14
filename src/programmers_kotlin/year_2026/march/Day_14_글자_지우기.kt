package programmers_kotlin.year_2026.march

private class Day_14_글자_지우기 {
    fun solution(my_string: String, indices: IntArray) = my_string.filterIndexed { index, _ -> index !in indices.toSet() }
}

fun main() {
    println(Day_14_글자_지우기().solution("apporoograpemmemprs", intArrayOf(1, 16, 6, 15, 0, 10, 11, 3)))
}
