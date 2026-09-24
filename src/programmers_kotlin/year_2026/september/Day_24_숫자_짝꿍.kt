package programmers_kotlin.year_2026.september

private class Day_24_숫자_짝꿍 {
    fun solution(X: String, Y: String): String {
        val countX = IntArray(10).also { c -> X.forEach { c[it - '0']++ } }
        val countY = IntArray(10).also { c -> Y.forEach { c[it - '0']++ } }

        val answer = buildString {
            for (d in 9 downTo 0) {
                repeat(minOf(countX[d], countY[d])) { append(d) }
            }
        }

        return when {
            answer.isEmpty() -> "-1"
            answer[0] == '0' -> "0"
            else -> answer
        }
    }
}

fun main() {
    println(Day_24_숫자_짝꿍().solution("100", "2345"))
}
