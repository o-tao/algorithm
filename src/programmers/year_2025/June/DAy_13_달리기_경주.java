package programmers.year_2025.June;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DAy_13_달리기_경주 {

    public static void main(String[] args) {
        DAy_13_달리기_경주 tao = new DAy_13_달리기_경주();

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(tao.solution(players, callings)));
    }

    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String call : callings) {
            int currentIndex = map.get(call);
            int frontIndex = currentIndex - 1;

            String frontPlayer = players[frontIndex];

            players[frontIndex] = call;
            players[currentIndex] = frontPlayer;

            map.put(call, frontIndex);
            map.put(frontPlayer, currentIndex);
        }

        return players;
    }
}
