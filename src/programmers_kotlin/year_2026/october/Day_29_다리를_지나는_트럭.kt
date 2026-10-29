package programmers_kotlin.year_2026.october

private class Day_29_다리를_지나는_트럭 {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        val bridge = ArrayDeque<Int>()
        repeat(bridge_length) { bridge.addLast(0) }

        var time = 0
        var bridgeWeight = 0
        var idx = 0

        while (idx < truck_weights.size) {
            time++
            bridgeWeight -= bridge.removeFirst()

            val next = truck_weights[idx]
            if (bridgeWeight + next <= weight) {
                bridge.addLast(next)
                bridgeWeight += next
                idx++
            } else {
                bridge.addLast(0)
            }
        }

        return time + bridge_length
    }
}

fun main() {
    println(
        Day_29_다리를_지나는_트럭().solution(
            bridge_length = 2,
            weight = 10,
            truck_weights = intArrayOf(7, 4, 5, 6)
        )
    )
}
