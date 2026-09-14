package programmers_kotlin.year_2026.september

private class Day_14_옹알이_2 {
    fun solution(babbling: Array<String>): Int {
        val sounds = listOf("aya", "ye", "woo", "ma")

        return babbling.count { word ->
            var i = 0
            var prev = ""

            while (i < word.length) {
                val matched = sounds.firstOrNull { word.startsWith(it, i) && it != prev } ?: return@count false
                prev = matched
                i += matched.length
            }
            true
        }
    }
}

fun main() {
    println(Day_14_옹알이_2().solution(arrayOf("aya", "yee", "u", "maa")))
}
