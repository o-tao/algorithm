package programmers_kotlin.year_2026.april

private class Day_24_qr_code {
    fun solution(q: Int, r: Int, code: String) = code.filterIndexed { index, _ -> index % q == r }
}

fun main() {
    println(Day_24_qr_code().solution(3, 1, "qjnwezgrpirldywt"))
}
