package programmers_kotlin.year_2026.october

private class Day_09_피로도 {
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        var answer = 0
        val visited = BooleanArray(dungeons.size)

        fun dfs(fatigue: Int, count: Int) {
            answer = maxOf(answer, count)
            for (i in dungeons.indices) {
                val (need, cost) = dungeons[i]
                if (!visited[i] && fatigue >= need) {
                    visited[i] = true
                    dfs(fatigue - cost, count + 1)
                    visited[i] = false
                }
            }
        }

        dfs(k, 0)
        return answer
    }
}

fun main() {
    println(
        Day_09_피로도().solution(
            k = 80,
            dungeons = arrayOf(intArrayOf(80, 20), intArrayOf(50, 40), intArrayOf(30, 10))
        )
    )
}
