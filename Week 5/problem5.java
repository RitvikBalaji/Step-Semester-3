import java.util.Arrays;
import java.util.Scanner;
class Player implements Comparable<Player> {
    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;
    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }
    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }
    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }
    public int compareTo(Player other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }
}
public class problem5 {
    static String draftAndRank(Player[] players) {
        Player[] draftable = new Player[players.length];
        int count = 0;
        for (int i = 0; i < players.length; i++) {
            if (Player.isDraftable(players[i].matchesPlayed) || Player.isDraftable(players[i].matchesPlayed, players[i].injured))
                draftable[count++] = players[i];
        }
        draftable = Arrays.copyOf(draftable, count);
        Arrays.sort(draftable);
        String result = "";
        for (int i = 0; i < draftable.length; i++) {
            if (i > 0) result += " | ";
            result += (i + 1) + ". " + draftable[i].name;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int matches = sc.nextInt();
            double average = sc.nextDouble();
            boolean injured = sc.nextBoolean();
            players[i] = new Player(name, matches, average, injured);
        }
        System.out.println(draftAndRank(players));
        sc.close();
    }
}
