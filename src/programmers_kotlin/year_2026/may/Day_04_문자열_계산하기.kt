package programmers_kotlin.year_2026.may

private class Day_04_문자열_계산하기 {
    fun solution(my_string: String): Int {
        val tokens = my_string.split(" ")
        var answer = tokens[0].toInt()

        for (i in 1 until tokens.size step 2) {
            val num = tokens[i + 1].toInt()

            answer = if (tokens[i] == "+") answer + num else answer - num
        }

        return answer
    }
}

fun main() {
    println(Day_04_문자열_계산하기().solution("3 + 4"))
}
