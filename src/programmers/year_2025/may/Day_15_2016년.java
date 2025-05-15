package programmers.year_2025.may;


import java.util.Arrays;

public class Day_15_2016년 {

    public static void main(String[] args) {
        Day_15_2016년 tao = new Day_15_2016년();

        int a = 5;
        int b = 24;

        System.out.println(tao.solution(a, b));
    }

    public String solution(int a, int b) {
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = Arrays.stream(monthDays, 0, a - 1).sum() + b - 1;

        return days[totalDays % 7];
    }
}
