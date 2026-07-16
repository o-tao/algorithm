package programmers_kotlin.year_2026.july

private class Day_16_서울에서_김서방_찾기 {
    fun solution(seoul: Array<String>) = "김서방은 ${seoul.indexOf("Kim")}에 있다"
}

fun main() {
    println(Day_16_서울에서_김서방_찾기().solution(arrayOf("Jane", "Kim")))
}
