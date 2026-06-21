package programmers_kotlin.year_2026.june

private class Day_21_평행 {
    fun solution(dots: Array<IntArray>): Int {
        val cases = arrayOf(
            intArrayOf(0, 1, 2, 3),
            intArrayOf(0, 2, 1, 3),
            intArrayOf(0, 3, 1, 2)
        )

        for (case in cases) {
            val p1 = dots[case[0]]
            val p2 = dots[case[1]]
            val p3 = dots[case[2]]
            val p4 = dots[case[3]]

            val dx1 = p2[0] - p1[0]
            val dy1 = p2[1] - p1[1]

            val dx2 = p4[0] - p3[0]
            val dy2 = p4[1] - p3[1]

            if (dy1 * dx2 == dy2 * dx1) {
                return 1
            }
        }

        return 0
    }
}

fun main() {
    println(Day_21_평행().solution(arrayOf(intArrayOf(1, 4), intArrayOf(9, 2), intArrayOf(3, 8), intArrayOf(11, 6))))
}
