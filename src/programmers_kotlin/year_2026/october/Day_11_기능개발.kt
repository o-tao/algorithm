package programmers_kotlin.year_2026.october

private class Day_11_기능개발 {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        var deployDay = 0

        for (i in progresses.indices) {
            val days = (100 - progresses[i] + speeds[i] - 1) / speeds[i]

            if (days > deployDay) {
                deployDay = days
                answer.add(1)
            } else {
                answer[answer.lastIndex]++
            }
        }
        return answer.toIntArray()
    }
}

fun main() {
    println(
        Day_11_기능개발().solution(
            progresses = intArrayOf(93, 30, 55),
            speeds = intArrayOf(1, 30, 5)
        ).contentToString()
    )
}
