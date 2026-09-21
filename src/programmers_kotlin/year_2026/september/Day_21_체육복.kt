package programmers_kotlin.year_2026.september

private class Day_21_체육복 {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val clothes = IntArray(n + 2) { 1 }
        lost.forEach { clothes[it]-- }
        reserve.forEach { clothes[it]++ }

        for (i in 1..n) {
            if (clothes[i] != 0) continue

            if (clothes[i - 1] == 2) {
                clothes[i - 1]--
                clothes[i]++
            } else if (clothes[i + 1] == 2) {
                clothes[i + 1]--
                clothes[i]++
            }
        }

        return (1..n).count { clothes[it] > 0 }
    }
}

fun main() {
    println(
        Day_21_체육복().solution(
            n = 5,
            lost = intArrayOf(2, 4),
            reserve = intArrayOf(1, 3, 5),
        )
    )
}
