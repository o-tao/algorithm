package programmers_kotlin.year_2025.november

private class Day_21_더_크게_합치기 {
    fun solution(a: Int, b: Int): Int {
        val ab = (a.toString() + b.toString()).toInt()
        val ba = (b.toString() + a.toString()).toInt()
        return if (ab >= ba) ab else ba
    }
}

fun main() {
    println(Day_21_더_크게_합치기().solution(9, 91))
}
