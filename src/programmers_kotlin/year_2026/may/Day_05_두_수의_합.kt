package programmers_kotlin.year_2026.may

private class Day_05_두_수의_합 {
    fun solution(a: String, b: String): String {
        val answer = StringBuilder()

        var i = a.length - 1
        var j = b.length - 1
        var carry = 0

        while (i >= 0 || j >= 0 || carry > 0) {
            val numA = if (i >= 0) a[i] - '0' else 0
            val numB = if (j >= 0) b[j] - '0' else 0

            val sum = numA + numB + carry

            answer.append(sum % 10)
            carry = sum / 10

            i--
            j--
        }

        return answer.reverse().toString()
    }
}

fun main() {
    println(Day_05_두_수의_합().solution("582", "734"))
}
