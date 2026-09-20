package programmers_kotlin.year_2026.september

private class Day_20_로또의_최고_순위와_최저_순위 {
    fun solution(lottos: IntArray, win_nums: IntArray) =
        intArrayOf(
            minOf(6, 7 - (lottos.count { it in win_nums } + lottos.count { it == 0 })),
            minOf(6, 7 - lottos.count { it in win_nums })
        )
}

fun main() {
    println(
        Day_20_로또의_최고_순위와_최저_순위().solution(
            lottos = intArrayOf(44, 1, 0, 0, 31, 25),
            win_nums = intArrayOf(31, 10, 45, 1, 6, 19)
        ).contentToString()
    )
}
