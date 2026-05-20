package programmers_kotlin.year_2026.may

private class Day_20_외계어_사전 {
    fun solution(spell: Array<String>, dic: Array<String>) = if (dic.any { it.toCharArray().sorted().joinToString("") == spell.sorted().joinToString("") }) 1 else 2
}

fun main() {
    println(
        Day_20_외계어_사전().solution(
            spell = arrayOf("p", "o", "s"),
            dic = arrayOf("sod", "eocd", "qixm", "adio", "soo")
        )
    )
}
