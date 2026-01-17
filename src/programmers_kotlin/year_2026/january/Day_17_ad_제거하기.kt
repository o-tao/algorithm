package programmers_kotlin.year_2026.january

private class Day_17_ad_제거하기 {
    fun solution(strArr: Array<String>) = strArr.filter { !it.contains("ad") }.toTypedArray()
}

fun main() {
    println(Day_17_ad_제거하기().solution(arrayOf("and", "notad", "abcd")).toList())
}
