package programmers_kotlin.year_2026.january

private class Day_07_꼬리_문자열 {
    fun solution(str_list: Array<String>, ex: String) = str_list.filterNot { it.contains(ex) }.joinToString("")
}

fun main() {
    println(Day_07_꼬리_문자열().solution(arrayOf("abc", "def", "ghi"), "ef"))
}
