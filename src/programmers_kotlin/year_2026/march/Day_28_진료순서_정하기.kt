package programmers_kotlin.year_2026.march

private class Day_28_진료순서_정하기 {
    fun solution(emergency: IntArray) = emergency.map { value -> emergency.sortedDescending().indexOf(value) + 1 }.toIntArray()
}

fun main() {
    println(Day_28_진료순서_정하기().solution(intArrayOf(3, 76, 24)).contentToString())
}
