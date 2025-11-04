package programmers_kotlin.year_2025.november

private class Day_04_배열_원소의_길이 {
    fun solution(strlist: Array<String>) = strlist.map { it.length }.toIntArray()
}

fun main() {
    println(Day_04_배열_원소의_길이().solution(arrayOf("We", "are", "the", "world!")).toList())
}
