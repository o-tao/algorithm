package programmers_kotlin.year_2026.january

private class Day_29_특정한_문자를_대문자로_바꾸기 {
    fun solution(my_string: String, alp: String) = my_string.replace(alp, alp.uppercase())
}

fun main() {
    println(Day_29_특정한_문자를_대문자로_바꾸기().solution("programmers", "p"))
}
