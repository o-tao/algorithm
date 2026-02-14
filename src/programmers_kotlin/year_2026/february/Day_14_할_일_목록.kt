package programmers_kotlin.year_2026.february

private class Day_14_할_일_목록 {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        val answer = mutableListOf<String>()

        for (i in todo_list.indices) {
            if (!finished[i]) {
                answer.add(todo_list[i])
            }
        }

        return answer.toTypedArray()
    }
}

fun main() {
    println(Day_14_할_일_목록().solution(arrayOf("problemsolving", "practiceguitar", "swim", "studygraph"), booleanArrayOf(true, false, true, false)).toList())
}
