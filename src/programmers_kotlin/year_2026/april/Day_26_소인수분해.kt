package programmers_kotlin.year_2026.april

private class Day_26_소인수분해 {
    fun solution(n: Int): IntArray {
        var num = n
        val answer = mutableListOf<Int>()
        var i = 2

        while (i * i <= num) {
            if (num % i == 0) {
                answer.add(i)
                while (num % i == 0) num /= i
            }
            i++
        }

        if (num > 1) answer.add(num)

        return answer.toIntArray()
    }
}

fun main() {
    println(Day_26_소인수분해().solution(12).contentToString())
}
