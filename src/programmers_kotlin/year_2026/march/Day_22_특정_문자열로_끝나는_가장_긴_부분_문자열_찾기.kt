package programmers_kotlin.year_2026.march

private class Day_22_특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {
    fun solution(myString: String, pat: String) = myString.substring(0, myString.lastIndexOf(pat) + pat.length)
}

fun main() {
    println(Day_22_특정_문자열로_끝나는_가장_긴_부분_문자열_찾기().solution("AbCdEFG", "dE"))
}
