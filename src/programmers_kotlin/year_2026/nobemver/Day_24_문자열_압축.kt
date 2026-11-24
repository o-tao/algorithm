package programmers_kotlin.year_2026.nobemver

private class Day_24_문자열_압축 {
    fun solution(s: String): Int {
        var answer = s.length

        for (unit in 1..s.length / 2) {
            var length = 0
            var prev = s.substring(0, unit)
            var count = 1
            var i = unit

            while (i + unit <= s.length) {
                val cur = s.substring(i, i + unit)
                if (cur == prev) {
                    count++
                } else {
                    length += unit + if (count > 1) count.toString().length else 0
                    prev = cur
                    count = 1
                }
                i += unit
            }
            length += unit + if (count > 1) count.toString().length else 0
            length += s.length - i

            answer = minOf(answer, length)
        }
        return answer
    }
}

fun main() {
    println(Day_24_문자열_압축().solution("aabbaccc"))
}
