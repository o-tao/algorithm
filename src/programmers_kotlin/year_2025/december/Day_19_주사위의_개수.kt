package programmers_kotlin.year_2025.december

private class Day_19_주사위의_개수 {
    fun solution(box: IntArray, n: Int) = (box[0] / n) * (box[1] / n) * (box[2] / n)
}

fun main() {
    println(Day_19_주사위의_개수().solution(intArrayOf(1, 1, 1), 1))
}
