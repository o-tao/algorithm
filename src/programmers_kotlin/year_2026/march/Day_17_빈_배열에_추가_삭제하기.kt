package programmers_kotlin.year_2026.march

private class Day_17_빈_배열에_추가_삭제하기 {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        val answer = mutableListOf<Int>()

        for (i in arr.indices) {
            if (flag[i]) repeat(arr[i] * 2) { answer.add(arr[i]) }
            else repeat(arr[i]) { answer.removeAt(answer.lastIndex) }
        }

        return answer.toIntArray()
    }
}

fun main() {
    println(Day_17_빈_배열에_추가_삭제하기().solution(intArrayOf(3, 2, 4, 1, 3), booleanArrayOf(true, false, true, false, false)).toList())
}
