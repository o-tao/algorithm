package programmers_kotlin.year_2025.october

class Day_10_각도기 {
    fun solution(angle: Int): Int {
        return when {
            angle in 1..89 -> 1
            angle == 90 -> 2
            angle in 91..179 -> 3
            angle == 180 -> 4
            else -> 0
        }
    }
}

fun main() {
    println(Day_10_각도기().solution(70))
}
