package codingTest.year_2025_Febuary.day_19;

public class Question1 {

    // 1000000 -> 1,000,000 으로 출력하시오.

    public static void main(String[] args) {
        Question1 tao = new Question1();

        String pay = "1000000";

        System.out.println(tao.solution(pay));

        // 정규식 사용
        System.out.println(pay.replaceAll("(\\d)(?=(\\d{3})+$)", "$1,"));
    }

    public String solution(String pay) {
        // 재귀 함수 사용
        return addComma(pay);

        /* StringBuilder 사용 수동 삽입
        StringBuilder sb = new StringBuilder(pay);

        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i, ',');
        }
        return String.valueOf(sb);
        */

        /* Format 사용 3가지 방법
        // 1
        int answer = Integer.parseInt(pay);
        DecimalFormat df = new DecimalFormat("###,###");
        return df.format(answer);

        // 2
        int answer = Integer.parseInt(pay);
        return NumberFormat.getInstance().format(answer);

        // 3
        int answer = Integer.parseInt(pay);
        return String.format("%,d", answer);
        */
    }

    // 재귀 함수 사용
    private String addComma(String pay) {
        if (pay.length() <= 3) return pay;

        return addComma(pay.substring(0, pay.length() - 3)) + "," + pay.substring(pay.length() - 3);
    }
}
