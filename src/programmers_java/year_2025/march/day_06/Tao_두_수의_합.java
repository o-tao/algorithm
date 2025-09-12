package programmers_java.year_2025.march.day_06;

import java.math.BigInteger;

public class Tao_두_수의_합 {

    public static void main(String[] args) {
        Tao_두_수의_합 tao = new Tao_두_수의_합();

        String a = "18446744073709551615";
        String b = "287346502836570928366";

        System.out.println(tao.solution(a, b));
    }

    public String solution(String a, String b) {
        BigInteger aBigInt = new BigInteger(a);
        BigInteger bBigInt = new BigInteger(b);
        return String.valueOf(aBigInt.add(bBigInt));
    }
}
