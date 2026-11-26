package programmers_kotlin.year_2026.nobemver

private class Day_26_과제_진행하기 {
    fun solution(plans: Array<Array<String>>): Array<String> {
        val sorted = plans.map {
            val (h, m) = it[1].split(":").map(String::toInt)
            Triple(it[0], h * 60 + m, it[2].toInt())
        }.sortedBy { it.second }

        val stack = ArrayDeque<Pair<String, Int>>()
        val answer = mutableListOf<String>()

        for (i in 0 until sorted.size - 1) {
            val (name, start, playtime) = sorted[i]
            var available = sorted[i + 1].second - start

            stack.addLast(name to playtime)

            while (stack.isNotEmpty() && available > 0) {
                val (topName, remain) = stack.removeLast()
                if (remain <= available) {
                    available -= remain
                    answer.add(topName)
                } else {
                    stack.addLast(topName to remain - available)
                    available = 0
                }
            }
        }

        answer.add(sorted.last().first)
        while (stack.isNotEmpty()) answer.add(stack.removeLast().first)

        return answer.toTypedArray()
    }
}

fun main() {
    println(
        Day_26_과제_진행하기().solution(
            plans = arrayOf(
                arrayOf("korean", "11:40", "30"),
                arrayOf("english", "12:10", "20"),
                arrayOf("math", "12:30", "40"),
            )
        ).contentToString()
    )
}
