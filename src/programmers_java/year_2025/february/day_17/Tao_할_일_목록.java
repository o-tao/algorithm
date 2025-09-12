package programmers_java.year_2025.february.day_17;


import java.util.ArrayList;
import java.util.Arrays;

public class Tao_할_일_목록 {

    public static void main(String[] args) {
        Tao_할_일_목록 tao = new Tao_할_일_목록();
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};

        System.out.println(Arrays.toString(tao.solution(todo_list, finished)));
    }

    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer.add(todo_list[i]);
            }
        }

        return answer.toArray(String[]::new);
    }
}
