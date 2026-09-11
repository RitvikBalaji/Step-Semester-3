import java.util.Scanner;
public class problem4 {
    static double rowAverage(int[] row) {
        int sum = 0;
        for (int i = 0; i < row.length; i++) sum += row[i];
        return (double) sum / row.length;
    }
    static String classifyMatches(int[][] runsPerOver, int threshold) {
        String result = "";
        for (int i = 0; i < runsPerOver.length; i++) {
            double average = rowAverage(runsPerOver[i]);
            if (i > 0) result += " | ";
            result += "Match " + i + ": " + (average >= threshold ? "Power Surge" : "Normal");
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] runsPerOver = new int[n][];
        for (int i = 0; i < n; i++) {
            int overs = sc.nextInt();
            runsPerOver[i] = new int[overs];
            for (int j = 0; j < overs; j++) runsPerOver[i][j] = sc.nextInt();
        }
        int threshold = sc.nextInt();
        System.out.println(classifyMatches(runsPerOver, threshold));
        sc.close();
    }
}
