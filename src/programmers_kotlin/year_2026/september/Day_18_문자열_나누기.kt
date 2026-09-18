package programmers_kotlin.year_2026.september

private class Day_18_문자열_나누기 {
    fun solution(s: String): Int {
        var x = ' '
        var balance = 0

        val splits = s.count { c ->
            if (balance == 0) x = c
            balance += if (c == x) 1 else -1
            balance == 0
        }

        return splits + if (balance != 0) 1 else 0
    }
}

fun main() {
    println(Day_18_문자열_나누기().solution("banana"))
}
