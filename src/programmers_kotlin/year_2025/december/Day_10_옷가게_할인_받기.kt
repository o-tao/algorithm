package programmers_kotlin.year_2025.december

private class Day_10_옷가게_할인_받기 {
    fun solution(price: Int): Int {
        val rate = when {
            price >= 500_000 -> 80
            price >= 300_000 -> 90
            price >= 100_000 -> 95
            else -> 100
        }
        return price * rate / 100
    }
}

fun main() {
    println(Day_10_옷가게_할인_받기().solution(150_000))
}
