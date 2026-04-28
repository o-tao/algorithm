package programmers_kotlin.year_2026.april

private class Day_28_문자열_여러_번_뒤집기 {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        val answer = my_string.toCharArray()

        for (query in queries) {
            var s = query[0]
            var e = query[1]

            while (s < e) {
                val temp = answer[s]
                answer[s] = answer[e]
                answer[e] = temp

                s++
                e--
            }
        }

        return answer.joinToString("")
    }
}

fun main() {
    println(Day_28_문자열_여러_번_뒤집기().solution("rermgorpsam", arrayOf(intArrayOf(2, 3), intArrayOf(0, 7), intArrayOf(5, 9), intArrayOf(6, 10))))
}
