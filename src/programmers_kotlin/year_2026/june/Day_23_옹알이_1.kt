package programmers_kotlin.year_2026.june

private class Day_23_옹알이_1 {
    fun solution(babbling: Array<String>): Int {
        val text = arrayOf("aya", "ye", "woo", "ma")

        return babbling.count { babble ->
            var answer = babble

            text.forEach {
                answer = answer.replace(it, " ")
            }

            answer.isBlank()
        }
    }
}

fun main() {
    println(Day_23_옹알이_1().solution(arrayOf("aya", "yee", "u", "maa", "wyeoo")))
}
