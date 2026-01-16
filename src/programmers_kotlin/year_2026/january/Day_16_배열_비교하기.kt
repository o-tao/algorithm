package programmers_kotlin.year_2026.january

private class Day_16_배열_비교하기 {
    fun solution(arr1: IntArray, arr2: IntArray) =
        when {
            arr1.size != arr2.size ->
                arr1.size.compareTo(arr2.size)

            arr1.sum() != arr2.sum() ->
                arr1.sum().compareTo(arr2.sum())

            else -> 0
        }
}

fun main() {
    println(Day_16_배열_비교하기().solution(intArrayOf(49, 13), intArrayOf(70, 11, 2)))
}
