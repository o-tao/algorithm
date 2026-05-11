package programmers_kotlin.year_2026.may

private class Day_11_그림_확대 {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        val answer = mutableListOf<String>()

        for (line in picture) {
            val enlarged = buildString {
                for (ch in line) {
                    repeat(k) {
                        append(ch)
                    }
                }
            }

            repeat(k) {
                answer.add(enlarged)
            }
        }

        return answer.toTypedArray()
    }
}

fun main() {
    println(Day_11_그림_확대().solution(arrayOf(".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."), 2).contentToString())
}
