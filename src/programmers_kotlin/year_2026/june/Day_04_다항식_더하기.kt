package programmers_kotlin.year_2026.june

private class Day_04_다항식_더하기 {
    fun solution(polynomial: String): String {
        var xSum = 0
        var numSum = 0

        polynomial.split(" + ").forEach { term ->
            if (term.contains("x")) {
                xSum += if (term == "x") 1 else term.dropLast(1).toInt()
            } else {
                numSum += term.toInt()
            }
        }

        return when {
            xSum == 0 -> "$numSum"
            numSum == 0 -> if (xSum == 1) "x" else "${xSum}x"
            else -> {
                val xPart = if (xSum == 1) "x" else "${xSum}x"
                "$xPart + $numSum"
            }
        }
    }
}

fun main() {
    println(Day_04_다항식_더하기().solution("3x + 7 + x"))
}
