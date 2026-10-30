package programmers_kotlin.year_2026.october

private class Day_30_큰_수_만들기 {
    fun solution(number: String, k: Int): String {
        val stack = StringBuilder()
        var remain = k

        for (c in number) {
            while (remain > 0 && stack.isNotEmpty() && stack[stack.length - 1] < c) {
                stack.setLength(stack.length - 1)
                remain--
            }
            stack.append(c)
        }

        return stack.substring(0, stack.length - remain)
    }
}

fun main() {
    println(Day_30_큰_수_만들기().solution("1924", 2))
}
