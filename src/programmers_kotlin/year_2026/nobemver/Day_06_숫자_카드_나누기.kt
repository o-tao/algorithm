package programmers_kotlin.year_2026.nobemver

private class Day_06_숫자_카드_나누기 {
    fun solution(arrayA: IntArray, arrayB: IntArray): Int {
        val gcdA = arrayA.reduce { acc, n -> gcd(acc, n) }
        val gcdB = arrayB.reduce { acc, n -> gcd(acc, n) }

        val candA = if (arrayB.none { it % gcdA == 0 }) gcdA else 0
        val candB = if (arrayA.none { it % gcdB == 0 }) gcdB else 0

        return maxOf(candA, candB)
    }

    private tailrec fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

fun main() {
    println(Day_06_숫자_카드_나누기().solution(intArrayOf(10, 17), intArrayOf(5, 20)))
}
