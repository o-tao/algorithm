package programmers_kotlin.year_2026.august

private class Day_13_최대공약수와_최소공배수 {
    fun solution(n: Int, m: Int): IntArray {
        var a = n
        var b = m

        while (b != 0) {
            val temp = a % b
            a = b
            b = temp
        }

        return intArrayOf(a, n * m / a)
    }
}

fun main() {
    println(
        Day_13_최대공약수와_최소공배수().solution(
            n = 3,
            m = 12
        ).contentToString()
    )
}
