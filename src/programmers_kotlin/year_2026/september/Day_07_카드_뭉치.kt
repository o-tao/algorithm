package programmers_kotlin.year_2026.september

private class Day_07_카드_뭉치 {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var i = 0
        var j = 0
        for (word in goal) {
            when {
                i < cards1.size && cards1[i] == word -> i++
                j < cards2.size && cards2[j] == word -> j++
                else -> return "No"
            }
        }
        return "Yes"
    }
}

fun main() {
    println(
        Day_07_카드_뭉치().solution(
            cards1 = arrayOf("i", "drink", "water"),
            cards2 = arrayOf("want", "to"),
            goal = arrayOf("i", "want", "to", "drink", "water")
        )
    )
}
