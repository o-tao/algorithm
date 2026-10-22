package programmers_kotlin.year_2026.october

private class Day_22_오픈채팅방 {
    fun solution(record: Array<String>): Array<String> {
        val nickname = HashMap<String, String>()
        val logs = ArrayList<Pair<String, String>>() // (uid, action)

        for (r in record) {
            val parts = r.split(" ")
            val action = parts[0]
            val uid = parts[1]

            when (action) {
                "Enter" -> {
                    nickname[uid] = parts[2]
                    logs.add(uid to action)
                }

                "Leave" -> logs.add(uid to action)
                "Change" -> nickname[uid] = parts[2]
            }
        }

        return logs.map { (uid, action) ->
            val name = nickname[uid]
            if (action == "Enter") "${name}님이 들어왔습니다."
            else "${name}님이 나갔습니다."
        }.toTypedArray()
    }
}

fun main() {
    println(Day_22_오픈채팅방().solution(arrayOf("Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan")).contentToString())
}
