package programmers_java.year_2025.april;

import java.util.Arrays;

public class Day_14_최대공약수와_최소공배수 {

    public static void main(String[] args) {
        Day_14_최대공약수와_최소공배수 tao = new Day_14_최대공약수와_최소공배수();

        int n = 3;
        int m = 12;

        System.out.println(Arrays.toString(tao.solution(n, m)));
    }

    public int[] solution(int n, int m) {
        int a = n;
        int b = m;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int lcm = (n * m) / gcd;

        return new int[]{gcd, lcm};
    }
}
