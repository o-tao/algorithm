package programmers_java.year_2025.april;

public class Day_20_최소직사각형 {

    public static void main(String[] args) {
        Day_20_최소직사각형 tao = new Day_20_최소직사각형();

        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        System.out.println(tao.solution(sizes));
    }

    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;

        for (int[] size : sizes) {
            w = Integer.max(w, Math.max(size[0], size[1]));
            h = Integer.max(h, Math.min(size[0], size[1]));
        }

        return w * h;
    }
}
