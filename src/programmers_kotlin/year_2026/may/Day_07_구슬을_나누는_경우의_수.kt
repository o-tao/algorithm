package programmers_kotlin.year_2026.may

private class Day_07_구슬을_나누는_경우의_수 {
    fun solution(balls: Int, share: Int): Int {
        var answer = 1L

        for (i in 0 until share) {
            answer = answer * (balls - i) / (i + 1)
        }

        return answer.toInt()
    }
}

fun main() {
    println(Day_07_구슬을_나누는_경우의_수().solution(3, 2))
}
