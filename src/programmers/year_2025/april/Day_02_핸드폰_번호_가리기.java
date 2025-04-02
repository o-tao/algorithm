package programmers.year_2025.april;

public class Day_02_핸드폰_번호_가리기 {

    public static void main(String[] args) {
        Day_02_핸드폰_번호_가리기 tao = new Day_02_핸드폰_번호_가리기();

        String phone_number = "01033334444";

        System.out.println(tao.solution(phone_number));
    }

    public String solution(String phone_number) {
        return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);
    }
}
