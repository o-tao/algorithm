package programmers_kotlin.year_2026.february

private class Day_09_배열에서_문자열_대소문자_변환하기 {
    fun solution(strArr: Array<String>) =
        strArr.mapIndexed { index, str ->
            if (index % 2 == 0) {
                str.lowercase()
            } else {
                str.uppercase()
            }
        }.toTypedArray()
}

fun main() {
    println(Day_09_배열에서_문자열_대소문자_변환하기().solution(arrayOf("AAA", "BBB", "CCC", "DDD")).toList())
}
