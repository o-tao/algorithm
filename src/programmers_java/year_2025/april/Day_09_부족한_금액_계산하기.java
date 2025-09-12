package programmers_java.year_2025.april;

import java.util.stream.LongStream;

public class Day_09_부족한_금액_계산하기 {

    public static void main(String[] args) {
        Day_09_부족한_금액_계산하기 tao = new Day_09_부족한_금액_계산하기();

        int price = 3;
        int money = 20;
        int count = 4;

        System.out.println(tao.solution(price, money, count));
    }

    public long solution(int price, int money, int count) {
        long totalPrice = LongStream.rangeClosed(0, count).map(i -> price * i).sum();
        return totalPrice < money ? 0 : totalPrice - money;
    }
}
