package programmers_kotlin.year_2026.nobemver

private class Day_11_메뉴_리뉴얼 {
    fun solution(orders: Array<String>, course: IntArray): Array<String> {
        val answer = mutableListOf<String>()
        val sortedOrders = orders.map { it.toCharArray().sorted().joinToString("") }

        for (size in course) {
            val count = HashMap<String, Int>()

            for (order in sortedOrders) {
                if (order.length < size) continue
                combine(order, size, 0, StringBuilder(), count)
            }

            val max = count.values.maxOrNull() ?: continue
            if (max < 2) continue
            count.filter { it.value == max }.keys.forEach { answer.add(it) }
        }

        return answer.sorted().toTypedArray()
    }

    private fun combine(
        order: String, size: Int, start: Int,
        sb: StringBuilder, count: HashMap<String, Int>
    ) {
        if (sb.length == size) {
            val key = sb.toString()
            count[key] = (count[key] ?: 0) + 1
            return
        }
        for (i in start until order.length) {
            sb.append(order[i])
            combine(order, size, i + 1, sb, count)
            sb.deleteCharAt(sb.length - 1)
        }
    }
}

fun main() {
    println(
        Day_11_메뉴_리뉴얼().solution(
            orders = arrayOf("ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"),
            course = intArrayOf(2, 3, 4)
        ).contentToString()
    )
}
