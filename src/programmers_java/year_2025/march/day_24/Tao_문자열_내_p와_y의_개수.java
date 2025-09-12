package programmers_java.year_2025.march.day_24;

public class Tao_문자열_내_p와_y의_개수 {

    public static void main(String[] args) {
        Tao_문자열_내_p와_y의_개수 tao = new Tao_문자열_내_p와_y의_개수();

        String s = "pPoooyY";

        System.out.println(tao.solution(s));
    }

    boolean solution(String s) {
        long p = s.chars().filter(c -> Character.toLowerCase(c) == 'p').count();
        long y = s.chars().filter(c -> Character.toLowerCase(c) == 'y').count();
        return p == y;
    }
}
