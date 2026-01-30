package programmers_kotlin.year_2026.january

private class Day_30_콜라츠_수열_만들기 {
    fun solution(n: Int): IntArray =
        buildList {
            var x = n
            add(x)
            while (x != 1) {
                x = if (x % 2 == 0) x / 2 else x * 3 + 1
                add(x)
            }
        }.toIntArray()
}

fun main() {
    println(Day_30_콜라츠_수열_만들기().solution(10).toList())
}
