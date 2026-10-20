package programmers_kotlin.year_2026.october

private class Day_20_숫자_변환하기 {
    fun solution(x: Int, y: Int, n: Int): Int {
        val answer = IntArray(y + 1) { -1 }
        answer[x] = 0

        for (i in x..y) {
            if (answer[i] == -1) continue
            for (next in intArrayOf(i + n, i * 2, i * 3)) {
                if (next <= y && (answer[next] == -1 || answer[next] > answer[i] + 1)) {
                    answer[next] = answer[i] + 1
                }
            }
        }
        return answer[y]
    }
}

fun main() {
    println(Day_20_숫자_변환하기().solution(10, 40, 5))
}
