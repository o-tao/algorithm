package programmers_kotlin.year_2026.may

private class Day_29_저주의_숫자_3 {
    fun solution(n: Int) = generateSequence(1) { it + 1 }.filter { it % 3 != 0 && !it.toString().contains('3') }.take(n).last()
}

fun main() {
    println(Day_29_저주의_숫자_3().solution(15))
}
