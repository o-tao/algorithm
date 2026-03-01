package programmers_kotlin.year_2026.march

private class Day_01_피자_나눠_먹기_2 {
    fun solution(n: Int): Int {
        var pizza = 1
        while ((pizza * 6) % n != 0) pizza++
        return pizza
    }
}

fun main() {
    println(Day_01_피자_나눠_먹기_2().solution(6))
}
