package programmers_kotlin.year_2026.june

private class Day_06_코드_처리하기 {
    fun solution(code: String): String {
        var mode = 0

        val answer = code.filterIndexed { idx, ch ->
            when {
                ch == '1' -> {
                    mode = 1 - mode
                    false
                }

                mode == 0 -> idx % 2 == 0
                else -> idx % 2 == 1
            }
        }

        return answer.ifEmpty { "EMPTY" }
    }
}

fun main() {
    println(Day_06_코드_처리하기().solution("abc1abc1abc"))
}
