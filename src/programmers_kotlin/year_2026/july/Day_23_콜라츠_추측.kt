package programmers_kotlin.year_2026.july

private class Day_23_콜라츠_추측 {
    fun solution(num: Int): Int {
        var n = num.toLong()
        var answer = 0

        while (n != 1L) {
            if (answer == 500) return -1
            n = if (n % 2 == 0L) n / 2 else n * 3 + 1
            answer++
        }

        return answer
    }
}

fun main() {
    println(Day_23_콜라츠_추측().solution(6))
}
