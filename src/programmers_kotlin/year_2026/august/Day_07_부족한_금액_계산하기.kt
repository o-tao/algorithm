package programmers_kotlin.year_2026.august

private class Day_07_부족한_금액_계산하기 {
    fun solution(price: Int, money: Int, count: Int) = maxOf(0L, price.toLong() * count * (count + 1) / 2 - money)
}

fun main() {
    println(Day_07_부족한_금액_계산하기().solution(3, 20, 4))
}
