package programmers_kotlin.year_2026.march

private class Day_24_문자열이_몇_번_등장하는지_세기 {
    fun solution(myString: String, pat: String) = myString.windowed(pat.length).count { it == pat }
}

fun main() {
    println(Day_24_문자열이_몇_번_등장하는지_세기().solution("banana", "ana"))
}
