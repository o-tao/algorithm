package programmers_kotlin.year_2026.september

private class Day_02_숫자_문자열과_영단어 {
    fun solution(s: String) =
        listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
            .foldIndexed(s) { i, acc, word -> acc.replace(word, i.toString()) }
            .toInt()
}

fun main() {
    println(Day_02_숫자_문자열과_영단어().solution("one4seveneight"))
}
