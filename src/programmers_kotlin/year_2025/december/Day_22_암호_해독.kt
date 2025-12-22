package programmers_kotlin.year_2025.december

private class Day_22_암호_해독 {
    fun solution(cipher: String, code: Int): String {
        val stringBuilder = StringBuilder()
        for (i in code - 1 until cipher.length step code) {
            stringBuilder.append(cipher[i])
        }
        return stringBuilder.toString()
    }
}

fun main() {
    println(Day_22_암호_해독().solution("dfjardstddetckdaccccdegk", 4))
}
