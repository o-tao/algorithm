package programmers_kotlin.year_2026.september

private class Day_27_이진_변환_반복하기 {
    fun solution(s: String): IntArray {
        var x = s
        var count = 0
        var zeros = 0

        while (x != "1") {
            val ones = x.count { it == '1' }
            zeros += x.length - ones
            x = ones.toString(2)
            count++
        }
        return intArrayOf(count, zeros)
    }
}

fun main() {
    println(Day_27_이진_변환_반복하기().solution("110010101001").contentToString())
}
