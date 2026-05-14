package programmers_kotlin.year_2026.may

class Day_14_a와_b_출력하기 {
    fun solution() {
        val (a, b) = readlnOrNull()?.split(" ")?.map { it.toInt() } ?: return
        println("a = $a")
        println("b = $b")
    }
}

fun main() {
    println(Day_14_a와_b_출력하기().solution())
}
