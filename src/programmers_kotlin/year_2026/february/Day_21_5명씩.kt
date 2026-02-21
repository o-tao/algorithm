package programmers_kotlin.year_2026.february

private class Day_21_5명씩 {
    fun solution(names: Array<String>) = names.filterIndexed { index, _ -> index % 5 == 0 }
}

fun main() {
    println(Day_21_5명씩().solution(arrayOf("nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx")))
}
