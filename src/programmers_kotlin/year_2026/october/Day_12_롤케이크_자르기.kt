package programmers_kotlin.year_2026.october

private class Day_12_롤케이크_자르기 {
    fun solution(topping: IntArray): Int {
        val rightCount = IntArray(10_001)
        val leftSeen = BooleanArray(10_001)
        var rightKinds = 0
        var leftKinds = 0

        for (t in topping) {
            if (rightCount[t]++ == 0) rightKinds++
        }

        var answer = 0
        for (i in 0 until topping.size - 1) {
            val t = topping[i]

            if (--rightCount[t] == 0) rightKinds--

            if (!leftSeen[t]) {
                leftSeen[t] = true
                leftKinds++
            }

            if (leftKinds == rightKinds) answer++
        }
        return answer
    }
}

fun main() {
    println(Day_12_롤케이크_자르기().solution(intArrayOf(1, 2, 1, 3, 1, 4, 1, 2)))
}
