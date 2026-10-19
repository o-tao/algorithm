package programmers_kotlin.year_2026.october

private class Day_19_택배상자 {
    fun solution(order: IntArray): Int {
        val stack = IntArray(order.size)
        var top = 0
        var answer = 0

        for (box in 1..order.size) {
            stack[top++] = box
            while (top > 0 && stack[top - 1] == order[answer]) {
                top--
                answer++
            }
        }
        return answer
    }
}

fun main() {
    println(Day_19_택배상자().solution(intArrayOf(4, 3, 1, 2, 5)))
}
