package programmers_kotlin.year_2026.september

private class Day_10_2016년 {
    fun solution(a: Int, b: Int): String {
        val days = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val names = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")

        var total = b
        for (m in 0 until a - 1) {
            total += days[m]
        }

        return names[(total - 1) % 7]
    }
}

fun main() {
    println(Day_10_2016년().solution(5, 24))
}
