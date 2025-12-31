package programmers_kotlin.year_2025.december

private class Day_31_l로_만들기 {
    fun solution(myString: String) =
        buildString {
            myString.forEach {
                append(if (it < 'l') 'l' else it)
            }
        }
}

fun main() {
    println(Day_31_l로_만들기().solution("abcdevwxyz"))
}
