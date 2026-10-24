package programmers_kotlin.year_2026.october

private class Day_24_2개_이하로_다른_비트 {
    fun solution(numbers: LongArray): LongArray {
        return LongArray(numbers.size) { i ->
            val x = numbers[i]
            val bit = (x + 1) and x.inv()
            (x or bit) and (bit shr 1).inv()
        }
    }
}

fun main() {
    println(Day_24_2개_이하로_다른_비트().solution(longArrayOf(2, 7)).contentToString())
}
