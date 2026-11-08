package programmers_kotlin.year_2026.nobemver

private class Day_08_서버_증설_횟수 {
    fun solution(players: IntArray, m: Int, k: Int): Int {
        val expire = IntArray(24 + k)
        var active = 0
        var answer = 0

        for (i in 0 until 24) {
            active -= expire[i]
            val need = players[i] / m
            if (active < need) {
                val add = need - active
                answer += add
                active += add
                expire[i + k] += add
            }
        }
        return answer
    }
}

fun main() {
    println(
        Day_08_서버_증설_횟수().solution(
            players = intArrayOf(0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5),
            m = 3,
            k = 5
        )
    )
}
