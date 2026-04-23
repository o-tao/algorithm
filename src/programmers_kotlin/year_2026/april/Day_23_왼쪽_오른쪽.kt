package programmers_kotlin.year_2026.april

private class Day_23_왼쪽_오른쪽 {
    fun solution(str_list: Array<String>): List<String> {
        val lIndex = str_list.indexOf("l")
        val rIndex = str_list.indexOf("r")

        if (lIndex == -1 && rIndex == -1) return emptyList()

        return when {
            rIndex == -1 -> str_list.slice(0 until lIndex)

            lIndex == -1 -> str_list.slice(rIndex + 1 until str_list.size)

            lIndex < rIndex -> str_list.slice(0 until lIndex)

            else -> str_list.slice(rIndex + 1 until str_list.size)
        }
    }
}

fun main() {
    println(Day_23_왼쪽_오른쪽().solution(arrayOf("u", "u", "l", "r")))
}
