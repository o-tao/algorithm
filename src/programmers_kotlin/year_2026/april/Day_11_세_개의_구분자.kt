package programmers_kotlin.year_2026.april

private class Day_11_세_개의_구분자 {
    fun solution(myStr: String): Array<String> {
        val answer = mutableListOf<String>()
        val sb = StringBuilder()

        for (char in myStr) {
            if (char == 'a' || char == 'b' || char == 'c') {
                if (sb.isNotEmpty()) {
                    answer.add(sb.toString())
                    sb.clear()
                }
            } else {
                sb.append(char)
            }
        }

        if (sb.isNotEmpty()) answer.add(sb.toString()) else answer.add("EMPTY")

        return answer.toTypedArray()
    }
}

fun main() {
    println(Day_11_세_개의_구분자().solution("baconlettucetomato").toList())
}
