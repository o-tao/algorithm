package programmers_kotlin.year_2026.september

private class Day_29_카펫 {
    fun solution(brown: Int, yellow: Int): IntArray {
        val total = brown + yellow
        var height = 3

        while (height * height <= total) {
            if (total % height == 0) {
                val width = total / height
                if ((width - 2) * (height - 2) == yellow) {
                    return intArrayOf(width, height)
                }
            }
            height++
        }

        return intArrayOf()
    }
}

fun main() {
    println(Day_29_카펫().solution(10, 2).contentToString())
}
