package programmers_kotlin.year_2026.may

class Day_23_로그인_성공 {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        for (user in db) {
            if (user[0] == id_pw[0]) {
                return if (user[1] == id_pw[1]) "login" else "wrong pw"
            }
        }

        return "fail"
    }
}

fun main() {
    println(
        Day_23_로그인_성공().solution(
            id_pw = arrayOf("meosseugi", "1234"),
            db = arrayOf(arrayOf("rardss", "123"), arrayOf("yyoom", "1234"), arrayOf("meosseugi", "1234"))
        )
    )
}
