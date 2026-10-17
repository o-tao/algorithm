package programmers_kotlin.year_2026.october

private class Day_17_뒤에_있는_큰_수_찾기 {
    fun solution(numbers: IntArray): IntArray {
        val n = numbers.size
        val answer = IntArray(n) { -1 }
        val stack = IntArray(n)
        var top = 0

        for (i in 0 until n) {
            while (top > 0 && numbers[stack[top - 1]] < numbers[i]) {
                answer[stack[--top]] = numbers[i]
            }
            stack[top++] = i
        }
        return answer
    }
}

fun main() {
    println(Day_17_뒤에_있는_큰_수_찾기().solution(intArrayOf(2, 3, 3, 5)).contentToString())
}
