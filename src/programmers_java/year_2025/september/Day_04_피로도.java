package programmers_java.year_2025.september;

public class Day_04_피로도 {
    public static void main(String[] args) {
        Day_04_피로도 tao = new Day_04_피로도();

        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        System.out.println(tao.solution(k, dungeons));
    }

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        return dfs(k, dungeons, visited, 0);
    }

    private int dfs(int fatigue, int[][] dungeons, boolean[] visited, int count) {
        int maxCount = count;

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && fatigue >= dungeons[i][0]) {
                visited[i] = true;
                maxCount = Math.max(maxCount, dfs(fatigue - dungeons[i][1], dungeons, visited, count + 1));
                visited[i] = false;
            }
        }
        return maxCount;
    }
}
