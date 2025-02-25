package programmers.year_2025_February.day_17;

import java.util.ArrayList;
import java.util.Arrays;

public class Tao_5명씩 {

    // 5명씩

    public static void main(String[] args) {
        Tao_5명씩 tao = new Tao_5명씩();
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

        System.out.println(Arrays.toString(tao.solution(names)));
    }

    public String[] solution(String[] names) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < names.length; i += 5) {
            answer.add(names[i]);
        }

        return answer.toArray(String[]::new);
    }
}
