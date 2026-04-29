package programmers_kotlin.year_2026.april

private class Day_29_배열_만들기_4 {
    fun solution(arr: IntArray): IntArray {
        return arr.fold(mutableListOf<Int>()) { stk, value ->
            while (stk.isNotEmpty() && stk.last() >= value) {
                stk.removeAt(stk.size - 1)
            }
            stk.add(value)
            stk
        }.toIntArray()
    }
}

fun main() {
    println(Day_29_배열_만들기_4().solution(intArrayOf(1, 4, 2, 5, 3)).contentToString())
}
