package codingTest.year_2025_Febuary.day_19;

public class Question2 {

    // 결제 금액의 5%를 적립 / 3,000포인트 미만 시 3,000포인트 지급 / 30000포인트 이상 시 30,000포인트 지급 / 10단위 제거 (3650 포인트 -> 3600 포인트)

    public static void main(String[] args) {
        Question2 answer = new Question2();

        String pay = "75500";

        System.out.println(answer.solution(pay));
    }

    public int solution(String pay) {
        int point = (int) (Integer.parseInt(pay) * 0.05);

        if (point < 3000) {
            point = 3000;
        } else if (point > 30000) {
            point = 30000;
        }

        // 100단위로 절삭
        point = (point / 100) * 100;
        return point;
    }
}
