package programmers_kotlin.year_2026.january

private class Day_10_글자_이어_붙여_문자열_만들기 {
    fun solution(my_string: String, index_list: IntArray) = index_list.joinToString("") { my_string[it].toString() }
}

fun main() {
    println(Day_10_글자_이어_붙여_문자열_만들기().solution("cvsgiorszzzmrpaqpe", intArrayOf(16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7)))
}
