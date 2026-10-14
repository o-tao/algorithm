package programmers_kotlin.year_2026.october

private class Day_14_튜플 {
    fun solution(s: String): IntArray {
        val answer = HashMap<Int, Int>()

        var num = 0
        var reading = false
        for (c in s) {
            if (c.isDigit()) {
                num = num * 10 + (c - '0')
                reading = true
            } else if (reading) {
                answer[num] = (answer[num] ?: 0) + 1
                num = 0
                reading = false
            }
        }

        return answer.entries
            .sortedByDescending { it.value }
            .map { it.key }
            .toIntArray()
    }
}

fun main() {
    println(Day_14_튜플().solution("{{2},{2,1},{2,1,3},{2,1,3,4}}").contentToString())
}
