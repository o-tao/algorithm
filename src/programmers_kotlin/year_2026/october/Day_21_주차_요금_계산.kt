package programmers_kotlin.year_2026.october

import java.util.*

private class Day_21_주차_요금_계산 {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        val (baseTime, baseFee, unitTime, unitFee) = fees

        val inTime = HashMap<String, Int>()
        val totalTime = TreeMap<String, Int>()

        for (record in records) {
            val (time, car, type) = record.split(" ")
            val (h, m) = time.split(":").map { it.toInt() }
            val minute = h * 60 + m

            if (type == "IN") {
                inTime[car] = minute
            } else {
                val start = inTime.remove(car)!!
                totalTime[car] = totalTime.getOrDefault(car, 0) + (minute - start)
            }
        }

        for ((car, start) in inTime) {
            totalTime[car] = totalTime.getOrDefault(car, 0) + (1439 - start)
        }

        return totalTime.values.map { t ->
            if (t <= baseTime) baseFee
            else baseFee + ((t - baseTime + unitTime - 1) / unitTime) * unitFee
        }.toIntArray()
    }
}

fun main() {
    println(
        Day_21_주차_요금_계산().solution(
            fees = intArrayOf(180, 5000, 10, 600),
            records = arrayOf("05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT")
        ).contentToString()
    )
}
