package programmers_kotlin.year_2026.june

private class Day_19_주사위_게임_3 {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val counts = listOf(a, b, c, d).groupingBy { it }.eachCount()

        return when (counts.size) {
            1 -> {
                1111 * a
            }

            2 -> {
                val entries = counts.entries.toList()

                if (entries.any { it.value == 3 }) {
                    val p = entries.first { it.value == 3 }.key
                    val q = entries.first { it.value == 1 }.key
                    (10 * p + q) * (10 * p + q)
                } else {
                    val p = entries[0].key
                    val q = entries[1].key
                    (p + q) * kotlin.math.abs(p - q)
                }
            }

            3 -> {
                val qAndR = counts.filter { it.value == 1 }.keys.toList()

                qAndR[0] * qAndR[1]
            }

            else -> {
                minOf(a, b, c, d)
            }
        }
    }
}

fun main() {
    println(Day_19_주사위_게임_3().solution(2, 2, 2, 2))
}
