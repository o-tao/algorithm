package programmers_kotlin.year_2026.nobemver

private class Day_20_광물_캐기 {
    private val cost = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(5, 1, 1),
        intArrayOf(25, 5, 1)
    )
    private lateinit var ores: IntArray
    private var answer = Int.MAX_VALUE

    fun solution(picks: IntArray, minerals: Array<String>): Int {
        ores = minerals.map {
            when (it) {
                "diamond" -> 0
                "iron" -> 1
                else -> 2
            }
        }.toIntArray()
        dfs(picks, 0, 0)
        return answer
    }

    private fun dfs(picks: IntArray, idx: Int, sum: Int) {
        if (sum >= answer) return
        if (idx >= ores.size || picks.sum() == 0) {
            answer = minOf(answer, sum)
            return
        }
        for (p in 0..2) {
            if (picks[p] == 0) continue
            picks[p]--
            var add = 0
            val end = minOf(idx + 5, ores.size)
            for (i in idx until end) add += cost[p][ores[i]]
            dfs(picks, end, sum + add)
            picks[p]++
        }
    }
}

fun main() {
    println(
        Day_20_광물_캐기().solution(
            picks = intArrayOf(1, 3, 2),
            minerals = arrayOf("diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone")
        )
    )
}
