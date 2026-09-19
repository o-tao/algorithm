package programmers_kotlin.year_2026.september

private class Day_19_대충_만든_자판 {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val minPress = IntArray(26) { Int.MAX_VALUE }

        for (key in keymap) {
            key.forEachIndexed { i, c ->
                val idx = c - 'A'
                minPress[idx] = minOf(minPress[idx], i + 1)
            }
        }

        return targets.map { target ->
            var sum = 0
            for (c in target) {
                val press = minPress[c - 'A']
                if (press == Int.MAX_VALUE) return@map -1
                sum += press
            }
            sum
        }.toIntArray()
    }
}

fun main() {
    println(
        Day_19_대충_만든_자판().solution(
            keymap = arrayOf("ABACD", "BCEFD"),
            targets = arrayOf("ABCD", "AABB")
        ).contentToString()
    )
}
