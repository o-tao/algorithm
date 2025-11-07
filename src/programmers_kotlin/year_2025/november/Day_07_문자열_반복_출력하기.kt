package programmers_kotlin.year_2025.november

private class Day_07_문자열_반복_출력하기 {
    fun solution(my_string: String, n: Int): String {
        var answer = ""
        for (char in my_string) {
            answer += char.toString().repeat(n)
        }
        return answer
    }
}

fun main() {
    println(Day_07_문자열_반복_출력하기().solution("hello", 3))
}
