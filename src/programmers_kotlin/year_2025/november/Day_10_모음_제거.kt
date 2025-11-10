package programmers_kotlin.year_2025.november

private class Day_10_모음_제거 {
    fun solution(my_string: String): String {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        return my_string.filter { it !in vowels }
    }
}

fun main() {
    println(Day_10_모음_제거().solution("bus"))
}
