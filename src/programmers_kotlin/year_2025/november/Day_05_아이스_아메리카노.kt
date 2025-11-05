package programmers_kotlin.year_2025.november

private class Day_05_아이스_아메리카노 {
    fun solution(money: Int) =
        intArrayOf(
            money / 5500,
            money % 5500,
        )
}

fun main() {
    println(Day_05_아이스_아메리카노().solution(5500).contentToString())
}
