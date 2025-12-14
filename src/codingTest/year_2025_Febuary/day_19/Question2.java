package codingTest.year_2025_Febuary.day_19;

public class Question2 {

    // 결제 금액의 5%를 적립 / 3,000포인트 미만 시 3,000포인트 지급 / 30000포인트 이상 시 30,000포인트 지급 / 10단위 제거 (3650 포인트 -> 3600 포인트)
    // sql → 팀, 직원, 급여 → 팀별 직원들 하반기 급여액 조회

    public static void main(String[] args) {
        Question2 tao = new Question2();

        String pay = "75500";

        System.out.println(tao.solution(pay));
    }

    public int solution(String pay) {
        int point = (int) (Integer.parseInt(pay) * 0.05);

        if (point < 3_000) point = 3_000;
        else if (point > 30_000) point = 30_000;

        // 100단위로 절삭
        point = (point / 100) * 100;
        return point;
    }
}
