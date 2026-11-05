package programmers_kotlin.year_2026.nobemver

private class Day_05_호텔_대실 {
    fun solution(book_time: Array<Array<String>>): Int {
        val timeline = IntArray(24 * 60 + 10 + 1)

        fun toMinutes(t: String): Int {
            val (h, m) = t.split(":").map { it.toInt() }
            return h * 60 + m
        }

        for ((start, end) in book_time) {
            timeline[toMinutes(start)] += 1
            timeline[toMinutes(end) + 10] -= 1
        }

        var current = 0
        var answer = 0
        for (v in timeline) {
            current += v
            answer = maxOf(answer, current)
        }
        return answer
    }
}

fun main() {
    println(
        Day_05_호텔_대실().solution(
            arrayOf(
                arrayOf("15:00", "17:00"),
                arrayOf("16:40", "18:20"),
                arrayOf("14:20", "15:20"),
                arrayOf("14:10", "19:20"),
                arrayOf("18:20", "21:20"),
            )
        )
    )
}
