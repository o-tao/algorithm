package programmers_kotlin.year_2026.nobemver

private class Day_04_삼각_달팽이 {
    fun solution(n: Int): IntArray {
        val tri = Array(n) { IntArray(it + 1) }
        var x = -1
        var y = 0
        var num = 1

        for (i in 0 until n) {
            for (j in i until n) {
                when (i % 3) {
                    0 -> x++
                    1 -> y++
                    2 -> {
                        x--; y--
                    }
                }
                tri[x][y] = num++
            }
        }

        return tri.flatMap { it.toList() }.toIntArray()
    }
}

fun main() {
    println(Day_04_삼각_달팽이().solution(4).contentToString())
}
