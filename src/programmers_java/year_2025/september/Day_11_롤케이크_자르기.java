package programmers_java.year_2025.september;

import java.util.HashSet;
import java.util.Set;

public class Day_11_롤케이크_자르기 {
    public static void main(String[] args) {
        Day_11_롤케이크_자르기 tao = new Day_11_롤케이크_자르기();

        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};

        System.out.println(tao.solution(topping));
    }

    public int solution(int[] topping) {
        int toppingLength = topping.length;

        int[] left = new int[toppingLength];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < toppingLength; i++) {
            set.add(topping[i]);
            left[i] = set.size();
        }

        int[] right = new int[toppingLength];
        set.clear();
        for (int i = toppingLength - 1; i >= 0; i--) {
            set.add(topping[i]);
            right[i] = set.size();
        }

        int count = 0;
        for (int i = 0; i < toppingLength - 1; i++) {
            if (left[i] == right[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
