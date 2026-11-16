package programmers_kotlin.year_2026.nobemver

private class Day_16_괄호_변환 {
    fun solution(p: String): String {
        return convert(p)
    }

    private fun convert(w: String): String {
        // 1. 빈 문자열이면 빈 문자열 반환
        if (w.isEmpty()) return ""

        // 2. 가장 짧은 균형잡힌 괄호 문자열 u, v 분리
        var count = 0
        var index = 0

        for (i in w.indices) {
            if (w[i] == '(') {
                count++
            } else {
                count--
            }

            if (count == 0) {
                index = i + 1
                break
            }
        }

        val u = w.substring(0, index)
        val v = w.substring(index)

        // 3. u가 올바른 괄호 문자열인지 확인
        if (isCorrect(u)) {
            return u + convert(v)
        }

        // 4. u가 올바른 괄호 문자열이 아닌 경우
        val result = StringBuilder()

        // 4-1. '(' 추가
        result.append('(')

        result.append(convert(v))

        result.append(')')

        for (i in 1 until u.length - 1) {
            result.append(
                if (u[i] == '(') ')' else '('
            )
        }

        return result.toString()
    }

    // 올바른 괄호 문자열인지 검사
    private fun isCorrect(s: String): Boolean {
        var count = 0

        for (ch in s) {
            if (ch == '(') {
                count++
            } else {
                count--
            }

            // 닫는 괄호가 먼저 나오면 올바르지 않음
            if (count < 0) return false
        }

        return count == 0
    }
}

fun main() {
    println(Day_16_괄호_변환().solution("(()())()"))
}
