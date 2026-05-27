package programmers_kotlin.year_2026.may

private class Day_28_치킨_쿠폰 {
    fun solution(chicken: Int): Int =
        generateSequence(chicken to 0) { (coupon, total) ->
            if (coupon < 10) null
            else {
                val service = coupon / 10
                (coupon % 10 + service) to (total + service)
            }
        }.last().second
}

fun main() {
    println(Day_28_치킨_쿠폰().solution(100))
}
