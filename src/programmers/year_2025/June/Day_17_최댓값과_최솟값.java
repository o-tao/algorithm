package programmers.year_2025.June;

public class Day_17_최댓값과_최솟값 {

    public static void main(String[] args) {
        Day_17_최댓값과_최솟값 tao = new Day_17_최댓값과_최솟값();

        String s = "1 2 3 4";

        System.out.println(tao.solution(s));
    }

    public String solution(String s) {
        String[] strNumbers = s.split(" ");

        int min = Integer.parseInt(strNumbers[0]);
        int max = Integer.parseInt(strNumbers[0]);

        for (String str : strNumbers) {
            int num = Integer.parseInt(str);
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return min + " " + max;
    }
}
