package programmers_kotlin.year_2026.october

private class Day_07_의상 {
    fun solution(clothes: Array<Array<String>>) =
        clothes
            .groupingBy { it[1] }
            .eachCount()
            .values
            .fold(1) { acc, cnt -> acc * (cnt + 1) } - 1
}

fun main() {
    println(
        Day_07_의상().solution(
            arrayOf(
                arrayOf("yellow_hat", "headgear"),
                arrayOf("blue_sunglasses", "eyewear"),
                arrayOf("green_turban", "headgear")
            )
        )
    )
}
