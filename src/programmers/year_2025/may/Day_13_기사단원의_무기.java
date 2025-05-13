package programmers.year_2025.may;

import java.util.stream.IntStream;

public class Day_13_기사단원의_무기 {

    public static void main(String[] args) {
        Day_13_기사단원의_무기 tao = new Day_13_기사단원의_무기();

        int number = 5;
        int limit = 3;
        int power = 2;

        System.out.println(tao.solution(number, limit, power));
    }

    public int solution(int number, int limit, int power) {
        return IntStream.rangeClosed(1, number)
                .map(i -> {
                    int divisorCount = 0;
                    for (int j = 1; j * j <= i; j++) {
                        if (i % j == 0) {
                            divisorCount += 2;
                            if (j * j == i) divisorCount--;
                        }
                    }
                    return (divisorCount > limit) ? power : divisorCount;
                })
                .sum();
    }
}
