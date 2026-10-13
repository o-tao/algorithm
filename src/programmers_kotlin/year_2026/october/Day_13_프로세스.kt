package programmers_kotlin.year_2026.october

private class Day_13_프로세스 {
    fun solution(priorities: IntArray, location: Int): Int {
        val queue = ArrayDeque<Pair<Int, Int>>()
        priorities.forEachIndexed { i, p -> queue.addLast(i to p) }

        var answer = 0
        while (queue.isNotEmpty()) {
            val cur = queue.removeFirst()
            if (queue.any { it.second > cur.second }) {
                queue.addLast(cur)
            } else {
                answer++
                if (cur.first == location) return answer
            }
        }
        return answer
    }
}

fun main() {
    println(
        Day_13_프로세스().solution(
            priorities = intArrayOf(2, 1, 3, 2),
            location = 2
        )
    )
}
