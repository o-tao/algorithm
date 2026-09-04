package programmers_kotlin.year_2026.september

private class Day_04_문자열_내_마음대로_정렬하기 {
    fun solution(strings: Array<String>, n: Int) = strings.sortedWith(compareBy({ it[n] }, { it })).toTypedArray()
}

fun main() {
    println(Day_04_문자열_내_마음대로_정렬하기().solution(arrayOf("sun", "bed", "car"), 1).contentToString())
}
