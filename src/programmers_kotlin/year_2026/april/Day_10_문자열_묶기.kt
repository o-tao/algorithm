package programmers_kotlin.year_2026.april

private class Day_10_문자열_묶기 {
    fun solution(strArr: Array<String>) = strArr.groupBy { it.length }.values.maxOfOrNull { it.size } ?: 0
}

fun main() {
    println(Day_10_문자열_묶기().solution(arrayOf("a", "bc", "d", "efg", "hi")))
}
