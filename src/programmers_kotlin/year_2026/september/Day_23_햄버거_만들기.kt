package programmers_kotlin.year_2026.september

private class Day_23_햄버거_만들기 {
    fun solution(ingredient: IntArray): Int {
        val stack = IntArray(ingredient.size)
        var top = 0
        var answer = 0

        for (x in ingredient) {
            stack[top++] = x
            if (top >= 4 &&
                stack[top - 4] == 1 &&
                stack[top - 3] == 2 &&
                stack[top - 2] == 3 &&
                stack[top - 1] == 1
            ) {
                top -= 4
                answer++
            }
        }
        return answer
    }
}

fun main() {
    println(Day_23_햄버거_만들기().solution(intArrayOf(2, 1, 1, 2, 3, 1, 2, 3, 1)))
}
