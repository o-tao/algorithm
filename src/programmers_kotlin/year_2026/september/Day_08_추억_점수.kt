package programmers_kotlin.year_2026.september

private class Day_08_추억_점수 {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>) =
        photo.map { people ->
            people.sumOf { name.zip(yearning.toTypedArray()).toMap()[it] ?: 0 }
        }.toIntArray()
}

fun main() {
    println(
        Day_08_추억_점수().solution(
            name = arrayOf("may", "kein", "kain", "radi"),
            yearning = intArrayOf(5, 10, 1, 3),
            photo = arrayOf(
                arrayOf("may", "kein", "kain", "radi"),
                arrayOf("may", "kein", "brin", "deny"),
                arrayOf("kon", "kain", "may", "coni")
            )
        ).contentToString()
    )
}
