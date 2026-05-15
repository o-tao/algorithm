package programmers_kotlin.year_2026.may

private class Day_15_캐릭터의_좌표 {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var x = 0
        var y = 0

        val maxX = board[0] / 2
        val maxY = board[1] / 2

        for (key in keyinput) {
            when (key) {
                "up" -> if (y < maxY) y++
                "down" -> if (y > -maxY) y--
                "left" -> if (x > -maxX) x--
                "right" -> if (x < maxX) x++
            }
        }

        return intArrayOf(x, y)
    }
}

fun main() {
    println(Day_15_캐릭터의_좌표().solution(arrayOf("left", "right", "up", "right", "right"), intArrayOf(11, 11)).contentToString())
}
