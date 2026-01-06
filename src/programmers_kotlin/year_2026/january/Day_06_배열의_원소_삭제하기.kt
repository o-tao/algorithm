package programmers_kotlin.year_2026.january

private class Day_06_배열의_원소_삭제하기 {
    fun solution(arr: IntArray, delete_list: IntArray) = arr.filter { it !in delete_list.toSet() }.toIntArray()
}

fun main() {
    println(Day_06_배열의_원소_삭제하기().solution(intArrayOf(293, 1000, 395, 678, 94), intArrayOf(94, 777, 104, 1000, 1, 12)).toList())
}
