package programmers_kotlin.year_2026.march

private class Day_04_369_게임 {
    fun solution(order: Int) = order.toString().count { it == '3' || it == '6' || it == '9' }
}

fun main() {
    println(Day_04_369_게임().solution(3))
}
