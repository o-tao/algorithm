package programmers_java.year_2025.march.day_22;

import java.util.Arrays;
import java.util.stream.LongStream;

public class Tao_x만큼_간격이_있는_n개의_숫자 {

    public static void main(String[] args) {
        Tao_x만큼_간격이_있는_n개의_숫자 tao = new Tao_x만큼_간격이_있는_n개의_숫자();

        int x = 2, n = 5;

        System.out.println(Arrays.toString(tao.solution(x, n)));
    }

    public long[] solution(int x, int n) {
        return LongStream.rangeClosed(1, n).map(i -> x * i).toArray();
    }
}
