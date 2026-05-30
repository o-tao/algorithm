package programmers_kotlin.year_2026.may

private class Day_30_문자열_밀기 {
    fun solution(A: String, B: String): Int {
        var current = A

        for (i in 0 until A.length) {
            if (current == B) return i

            current = current.last() + current.dropLast(1)
        }

        return -1
    }
}

fun main() {
    println(Day_30_문자열_밀기().solution("hello", "ohell"))
}
