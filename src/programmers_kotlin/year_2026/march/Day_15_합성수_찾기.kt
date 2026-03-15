package programmers_kotlin.year_2026.march

private class Day_15_합성수_찾기 {
    fun solution(n: Int) = (1..n).count { num -> (1..num).count { num % it == 0 } >= 3 }
}

fun main() {
    println(Day_15_합성수_찾기().solution(10))
}
