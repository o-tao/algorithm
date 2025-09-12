package programmers_java.year_2025.may;

public class Day_28_지폐_접기 {

    public static void main(String[] args) {
        Day_28_지폐_접기 tao = new Day_28_지폐_접기();

        int[] wallet = {30, 15};
        int[] bill = {26, 17};

        System.out.println(tao.solution(wallet, bill));
    }

    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while (!((bill[0] <= wallet[0] && bill[1] <= wallet[1])
                || (bill[1] <= wallet[0] && bill[0] <= wallet[1]))) {

            if (bill[0] >= bill[1]) {
                bill[0] = bill[0] / 2;
            } else {
                bill[1] = bill[1] / 2;
            }
            answer++;
        }

        return answer;
    }
}
