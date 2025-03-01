package programmers.year_2025.february.day_28;


import java.util.stream.IntStream;

public class Tao_배열_비교하기 {

    public static void main(String[] args) {
        Tao_배열_비교하기 tao = new Tao_배열_비교하기();

        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};

        System.out.println(tao.solution(arr1, arr2));
    }

    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);

        if (answer == 0) {
            return Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }
        return answer;

//        int answer = 0;
//        int sum1 = 0;
//        int sum2 = 0;
//
//        for (int i : arr1) {
//            sum1 += i;
//        }
//        for (int i : arr2) {
//            sum2 += i;
//        }
//
//        if (arr1.length > arr2.length || arr1.length == arr2.length && sum1 > sum2) {
//            return 1;
//        } else if (arr1.length < arr2.length || arr1.length == arr2.length && sum1 < sum2) {
//            return -1;
//        }
//        return answer;
    }
}
