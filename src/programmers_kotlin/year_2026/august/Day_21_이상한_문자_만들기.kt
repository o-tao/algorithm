package programmers_kotlin.year_2026.august

private class Day_21_이상한_문자_만들기 {
    fun solution(s: String) =
        s.split(" ").joinToString(" ") { word ->
            word.mapIndexed { i, c ->
                if (i % 2 == 0) c.uppercaseChar() else c.lowercaseChar()
            }.joinToString("")
        }
}

fun main() {
    println(Day_21_이상한_문자_만들기().solution("try hello world"))
}
