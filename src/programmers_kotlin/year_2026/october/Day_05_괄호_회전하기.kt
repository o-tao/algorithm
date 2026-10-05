package programmers_kotlin.year_2026.october

private class Day_05_괄호_회전하기 {
    fun solution(s: String): Int {
        val pairs = mapOf(')' to '(', ']' to '[', '}' to '{')

        return s.indices.count { x ->
            val stack = ArrayDeque<Char>()
            (s.drop(x) + s.take(x)).all { c ->
                if (c in pairs) stack.removeLastOrNull() == pairs[c]
                else {
                    stack.addLast(c); true
                }
            } && stack.isEmpty()
        }
    }
}

fun main() {
    println(Day_05_괄호_회전하기().solution("[](){}"))
}
