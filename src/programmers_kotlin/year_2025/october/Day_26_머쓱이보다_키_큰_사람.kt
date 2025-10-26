package programmers_kotlin.year_2025.october

private class Day_26_머쓱이보다_키_큰_사람 {
    fun solution(array: IntArray, height: Int) = array.count { it > height }
}

fun main() {
    println(Day_26_머쓱이보다_키_큰_사람().solution(intArrayOf(149, 180, 192, 170), 167))
}
