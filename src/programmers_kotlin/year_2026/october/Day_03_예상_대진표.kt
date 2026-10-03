package programmers_kotlin.year_2026.october

private class Day_03_예상_대진표 {
    fun solution(n: Int, a: Int, b: Int): Int {
        var x = a
        var y = b
        var answer = 0

        while (x != y) {
            x = (x + 1) / 2
            y = (y + 1) / 2
            answer++
        }

        return answer
    }
}

fun main() {
    println(Day_03_예상_대진표().solution(8, 4, 7))
}
