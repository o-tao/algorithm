package programmers_kotlin.year_2026.april

private class Day_27_문자_개수_세기 {
    fun solution(my_string: String): IntArray {
        val answer = IntArray(52)

        for (c in my_string) {
            when (c) {
                in 'A'..'Z' -> answer[c - 'A']++
                in 'a'..'z' -> answer[c - 'a' + 26]++
            }
        }

        return answer
    }
}

fun main() {
    println(Day_27_문자_개수_세기().solution("Programmers").contentToString())
}
