package programmers_java.year_2025.april;

import java.util.Scanner;

public class Day_12_직사각형_별찍기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String line = "*".repeat(n);

        for (int i = 0; i < m; i++) {
            System.out.println(line);
        }
    }
}
