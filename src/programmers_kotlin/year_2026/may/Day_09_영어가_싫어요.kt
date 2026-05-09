package programmers_kotlin.year_2026.may

private class Day_09_영어가_싫어요 {
    fun solution(numbers: String): Long {
        var answer = numbers

        val englishNumbers = arrayOf(
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        )

        for (i in englishNumbers.indices) {
            answer = answer.replace(englishNumbers[i], i.toString())
        }

        return answer.toLong()
    }
}

fun main() {
    println(Day_09_영어가_싫어요().solution("onetwothreefourfivesixseveneightnine"))
}
