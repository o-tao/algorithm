package programmers_kotlin.year_2026.january

private class Day_26_배열의_길이에_따라_다른_연산하기 {
    fun solution(arr: IntArray, n: Int) =
        arr.mapIndexed { index, value ->
            val shouldAdd = if (arr.size % 2 == 1) index % 2 == 0 else index % 2 == 1
            if (shouldAdd) value + n else value
        }.toIntArray()
}

fun main() {
    println(Day_26_배열의_길이에_따라_다른_연산하기().solution(intArrayOf(49, 12, 100, 276, 33), 27).toList())
}
