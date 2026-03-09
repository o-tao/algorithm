package programmers_kotlin.year_2026.march

private class Day_09_배열_회전시키기 {
    fun solution(numbers: IntArray, direction: String): IntArray {
        val answer = IntArray(numbers.size)

        if (direction == "right") {
            answer[0] = numbers[numbers.size - 1]
            for (i in 1 until numbers.size) {
                answer[i] = numbers[i - 1]
            }
        } else {
            for (i in 0 until numbers.size - 1) {
                answer[i] = numbers[i + 1]
            }
            answer[numbers.size - 1] = numbers[0]
        }

        return answer
    }
}

fun main() {
    println(Day_09_배열_회전시키기().solution(intArrayOf(1, 2, 3), "right").toList())
}
