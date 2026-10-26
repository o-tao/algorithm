package programmers_kotlin.year_2026.october

private class Day_26_소수_찾기 {
    fun solution(numbers: String): Int {
        val n = numbers.length
        val made = HashSet<Int>()

        val stack = ArrayDeque<Pair<Int, Int>>()
        stack.addLast(0 to 0)
        while (stack.isNotEmpty()) {
            val (value, mask) = stack.removeLast()
            for (i in 0 until n) {
                if (mask and (1 shl i) != 0) continue
                val next = value * 10 + (numbers[i] - '0')
                made.add(next)
                stack.addLast(next to (mask or (1 shl i)))
            }
        }

        var answer = 0
        for (num in made) {
            if (num < 2) continue
            var isPrime = true
            var d = 2
            while (d.toLong() * d <= num) {
                if (num % d == 0) {
                    isPrime = false; break
                }
                d++
            }
            if (isPrime) answer++
        }
        return answer
    }
}

fun main() {
    println(Day_26_소수_찾기().solution("17"))
}
