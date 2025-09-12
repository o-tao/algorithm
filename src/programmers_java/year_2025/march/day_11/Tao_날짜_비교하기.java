package programmers_java.year_2025.march.day_11;

public class Tao_날짜_비교하기 {

    public static void main(String[] args) {
        Tao_날짜_비교하기 tao = new Tao_날짜_비교하기();

        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 29};

        System.out.println(tao.solution(date1, date2));
    }

    public int solution(int[] date1, int[] date2) {
        int answer = 0;

        for (int i = 0; i < date1.length; i++) {
            if (date1[i] < date2[i]) {
                answer = 1;
                break;
            } else if (date1[i] > date2[i]) {
                answer = 0;
                break;
            }
        }
        return answer;
    }
}
