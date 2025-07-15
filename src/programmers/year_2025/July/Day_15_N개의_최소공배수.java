package programmers.year_2025.July;

public class Day_15_N개의_최소공배수 {

    public static void main(String[] args) {
        Day_15_N개의_최소공배수 tao = new Day_15_N개의_최소공배수();

        int[] arr = {2, 6, 8, 14};

        System.out.println(tao.solution(arr));
    }

    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int a = answer;
            int b = arr[i];

            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            answer = answer * arr[i] / a;
        }

        return answer;
    }
}
