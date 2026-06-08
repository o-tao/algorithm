package programmers_kotlin.year_2026.june

private class Day_08_OX퀴즈 {
    fun solution(quiz: Array<String>): Array<String> {
        return quiz.map { expression ->
            val (x, op, y, _, z) = expression.split(" ")

            val result = when (op) {
                "+" -> x.toInt() + y.toInt()
                else -> x.toInt() - y.toInt()
            }

            if (result == z.toInt()) "O" else "X"
        }.toTypedArray()
    }
}

fun main() {
    println(Day_08_OX퀴즈().solution(arrayOf("3 - 4 = -3", "5 + 6 = 11")).contentToString())
}
