package programmers_kotlin.year_2026.march

private class Day_30_모스부호_1 {
    fun solution(letter: String): String {
        val morse = mapOf(
            ".-" to "a","-..." to "b","-.-." to "c","-.." to "d","." to "e","..-." to "f",
            "--." to "g","...." to "h",".." to "i",".---" to "j","-.-" to "k",".-.." to "l",
            "--" to "m","-." to "n","---" to "o",".--." to "p","--.-" to "q",".-." to "r",
            "..." to "s","-" to "t","..-" to "u","...-" to "v",".--" to "w","-..-" to "x",
            "-.--" to "y","--.." to "z"
        )

        return letter.split(" ").joinToString("") { morse.getValue(it) }
    }
}

fun main() {
    println(Day_30_모스부호_1().solution(".... . .-.. .-.. ---"))
}