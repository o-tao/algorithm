package programmers_kotlin.year_2026.nobemver

private class Day_15_수식_최대화 {
    fun solution(expression: String): Long {
        val priorities = listOf(
            listOf('+', '-', '*'),
            listOf('+', '*', '-'),
            listOf('-', '+', '*'),
            listOf('-', '*', '+'),
            listOf('*', '+', '-'),
            listOf('*', '-', '+')
        )

        var answer = 0L

        for (priority in priorities) {
            val numbers = mutableListOf<Long>()
            val operators = mutableListOf<Char>()

            val number = StringBuilder()

            for (ch in expression) {
                if (ch.isDigit()) {
                    number.append(ch)
                } else {
                    numbers.add(number.toString().toLong())
                    operators.add(ch)
                    number.clear()
                }
            }

            numbers.add(number.toString().toLong())

            for (op in priority) {
                var i = 0

                while (i < operators.size) {
                    if (operators[i] == op) {
                        val a = numbers[i]
                        val b = numbers[i + 1]

                        val result = when (op) {
                            '+' -> a + b
                            '-' -> a - b
                            '*' -> a * b
                            else -> 0L
                        }

                        numbers[i] = result
                        numbers.removeAt(i + 1)
                        operators.removeAt(i)
                    } else {
                        i++
                    }
                }
            }

            answer = maxOf(answer, kotlin.math.abs(numbers[0]))
        }

        return answer
    }
}

fun main() {
    println(Day_15_수식_최대화().solution("100-200*300-500+20"))
}
