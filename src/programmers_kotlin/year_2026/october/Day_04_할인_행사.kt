package programmers_kotlin.year_2026.october

class Day_04_할인_행사 {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        val wantMap = want.zip(number.toList()).toMap()
        val window = HashMap<String, Int>()
        var answer = 0

        for (i in discount.indices) {
            window[discount[i]] = (window[discount[i]] ?: 0) + 1

            if (i >= 10) {
                val out = discount[i - 10]
                window[out] = window[out]!! - 1
                if (window[out] == 0) window.remove(out)
            }

            if (i >= 9 && window == wantMap) answer++
        }

        return answer
    }
}

fun main() {
    println(
        Day_04_할인_행사().solution(
            want = arrayOf("banana", "apple", "rice", "pork", "pot"),
            number = intArrayOf(3, 2, 2, 2, 1),
            discount = arrayOf("chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana")
        )
    )
}
