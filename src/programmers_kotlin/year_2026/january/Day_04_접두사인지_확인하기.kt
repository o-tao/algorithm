package programmers_kotlin.year_2026.january

private class Day_04_접두사인지_확인하기 {
    fun solution(my_string: String, is_prefix: String) =
        if (my_string.startsWith(is_prefix)) 1 else 0
}

fun main() {
    println(Day_04_접두사인지_확인하기().solution("banana", "ban"))
}
