package programmers_kotlin.year_2026.july

private class Day_26_핸드폰_번호_가리기 {
    fun solution(phone_number: String) = "*".repeat(phone_number.length - 4) + phone_number.takeLast(4)
}

fun main() {
    println(Day_26_핸드폰_번호_가리기().solution("01033334444"))
}
