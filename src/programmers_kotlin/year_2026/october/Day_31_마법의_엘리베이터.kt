package programmers_kotlin.year_2026.october

private class Day_31_마법의_엘리베이터 {
    fun solution(storey: Int): Int {
        var n = storey
        var answer = 0

        while (n > 0) {
            val digit = n % 10
            val next = (n / 10) % 10
            n /= 10

            when {
                digit > 5 -> {
                    answer += 10 - digit
                    n += 1
                }

                digit < 5 -> {
                    answer += digit
                }

                else -> {
                    answer += 5
                    if (next >= 5) n += 1
                }
            }
        }
        return answer
    }
}

fun main() {
    println(Day_31_마법의_엘리베이터().solution(16))
}
