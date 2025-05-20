package programmers.year_2025.may;

public class Day_19_소수_만들기 {

    public static void main(String[] args) {
        Day_19_소수_만들기 tao = new Day_19_소수_만들기();

        int[] nums = {1, 2, 3, 4};

        System.out.println(tao.solution(nums));
    }

    public int solution(int[] nums) {
        int answer = 0;
        int numsLength = nums.length;

        for (int i = 0; i < numsLength - 2; i++) {
            for (int j = i + 1; j < numsLength - 1; j++) {
                for (int k = j + 1; k < numsLength; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    boolean isPrime = true;
                    if (sum < 2) {
                        isPrime = false;
                    } else {
                        for (int d = 2; d <= Math.sqrt(sum); d++) {
                            if (sum % d == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }

                    if (isPrime) answer++;
                }
            }
        }

        return answer;
    }
}
