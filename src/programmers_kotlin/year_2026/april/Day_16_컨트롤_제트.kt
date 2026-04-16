package programmers_kotlin.year_2026.april

private class Day_16_컨트롤_제트 {
    fun solution(s: String) =
        s.split(" ").fold(mutableListOf<Int>()) { acc, token ->
            if (token == "Z") acc.removeLast()
            else acc.add(token.toInt())
            acc
        }.sum()
}

fun main() {
    println(Day_16_컨트롤_제트().solution("1 2 Z 3"))
}
