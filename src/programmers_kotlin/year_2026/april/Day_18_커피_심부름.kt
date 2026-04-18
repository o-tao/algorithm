package programmers_kotlin.year_2026.april

private class Day_18_커피_심부름 {
    fun solution(order: Array<String>) = order.map { if (it.contains("cafelatte")) 5000 else 4500 }.sum()
}

fun main() {
    println(Day_18_커피_심부름().solution(arrayOf("cafelatte", "americanoice", "hotcafelatte", "anything")))
}
