package programmers_kotlin.year_2026.february

private class Day_18_A_강조하기 {
    fun solution(myString: String) =
        myString.map {
            when {
                it == 'a' -> 'A'
                it.isUpperCase() && it != 'A' -> it.lowercaseChar()
                else -> it
            }
        }.joinToString("")
}

fun main() {
    println(Day_18_A_강조하기().solution("abstract algebra"))
}
