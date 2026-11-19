package programmers_kotlin.year_2026.nobemver

private class Day_19_하노이의_탑 {
    fun solution(n: Int): Array<IntArray> {
        val moves = mutableListOf<IntArray>()

        fun hanoi(count: Int, from: Int, to: Int, via: Int) {
            if (count == 0) return
            hanoi(count - 1, from, via, to)
            moves.add(intArrayOf(from, to))
            hanoi(count - 1, via, to, from)
        }

        hanoi(n, 1, 3, 2)
        return moves.toTypedArray()
    }
}

fun main() {
    println(Day_19_하노이의_탑().solution(2).contentDeepToString())
}
