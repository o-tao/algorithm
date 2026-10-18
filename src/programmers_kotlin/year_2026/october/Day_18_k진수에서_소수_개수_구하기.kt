package programmers_kotlin.year_2026.october

private class Day_18_k진수에서_소수_개수_구하기 {
    fun solution(n: Int, k: Int): Int {
        return n.toString(k)
            .split("0")
            .filter { it.isNotEmpty() }
            .count { s ->
                val num = s.toLong()
                if (num < 2) return@count false
                var i = 2L
                while (i * i <= num) {
                    if (num % i == 0L) return@count false
                    i++
                }
                true
            }
    }
}

fun main() {
    println(Day_18_k진수에서_소수_개수_구하기().solution(437674, 3))
}
