package programmers_kotlin.year_2026.nobemver

private class Day_25_이모티콘_할인행사 {
    fun solution(users: Array<IntArray>, emoticons: IntArray): IntArray {
        val rates = intArrayOf(10, 20, 30, 40)
        val discounts = IntArray(emoticons.size)
        var bestSubs = 0
        var bestSales = 0

        fun dfs(idx: Int) {
            if (idx == emoticons.size) {
                var subs = 0
                var sales = 0
                for ((minRate, limit) in users) {
                    var cost = 0
                    for (i in emoticons.indices) {
                        if (discounts[i] >= minRate) {
                            cost += emoticons[i] * (100 - discounts[i]) / 100
                        }
                    }
                    if (cost >= limit) subs++ else sales += cost
                }
                if (subs > bestSubs || (subs == bestSubs && sales > bestSales)) {
                    bestSubs = subs
                    bestSales = sales
                }
                return
            }
            for (r in rates) {
                discounts[idx] = r
                dfs(idx + 1)
            }
        }

        dfs(0)
        return intArrayOf(bestSubs, bestSales)
    }
}

fun main() {
    println(
        Day_25_이모티콘_할인행사().solution(
            users = arrayOf(intArrayOf(40, 10000), intArrayOf(25, 10000)),
            emoticons = intArrayOf(7000, 9000)
        ).contentToString()
    )
}
