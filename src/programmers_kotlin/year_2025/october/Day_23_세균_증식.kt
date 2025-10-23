package programmers_kotlin.year_2025.october

private class Day_23_세균_증식 {
    fun solution(n: Int, t: Int): Int {
        var answer = n
        repeat(t) { answer *= 2 }
        return answer
    }
}

fun main() {
    println(Day_23_세균_증식().solution(2, 10))
}
