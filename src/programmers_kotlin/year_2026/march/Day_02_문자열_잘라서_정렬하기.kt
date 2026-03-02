package programmers_kotlin.year_2026.march

private class Day_02_문자열_잘라서_정렬하기 {
    fun solution(myString: String): Array<String> {
        return myString
            .split("x")
            .filter { it.isNotEmpty() }
            .sorted()
            .toTypedArray()
    }
}

fun main() {
    println(Day_02_문자열_잘라서_정렬하기().solution("axbxcxdx").toList())
}
