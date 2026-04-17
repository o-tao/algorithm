package programmers_kotlin.year_2026.april

private class Day_17_잘라서_배열로_저장하기 {
    fun solution(myStr: String, n: Int) = myStr.chunked(n).toTypedArray()
}

fun main() {
    println(Day_17_잘라서_배열로_저장하기().solution("abc1Addfggg4556b", 6).toList())
}
