package programmers_kotlin.year_2026.september

private class Day_01_푸드_파이트_대회 {
    fun solution(food: IntArray): String {
        val left = (1 until food.size).joinToString("") { i -> i.toString().repeat(food[i] / 2) }
        return left + "0" + left.reversed()
    }
}

fun main() {
    println(Day_01_푸드_파이트_대회().solution(intArrayOf(1, 3, 4, 6)))
}
