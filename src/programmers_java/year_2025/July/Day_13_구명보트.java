package programmers_java.year_2025.July;

import java.util.Arrays;

public class Day_13_구명보트 {

    public static void main(String[] args) {
        Day_13_구명보트 tao = new Day_13_구명보트();

        int[] people = {70, 50, 80, 50};
        int limit = 100;

        System.out.println(tao.solution(people, limit));
    }

    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int answer = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }

            right--;
            answer++;
        }

        return answer;
    }
}
