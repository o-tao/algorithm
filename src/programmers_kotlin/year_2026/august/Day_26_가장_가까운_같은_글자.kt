package programmers_kotlin.year_2026.august

private class Day_26_가장_가까운_같은_글자 {
    fun solution(s: String): IntArray {
        val last = IntArray(26) { -1 }
        return IntArray(s.length) { i ->
            val c = s[i] - 'a'
            val prev = last[c]
            last[c] = i
            if (prev == -1) -1 else i - prev
        }
    }
}

fun main() {
    println(Day_26_가장_가까운_같은_글자().solution("banana").contentToString())
}
