
public class Match {

    private static int counter = 1;
    private int matchId;
    private Player p1, p2;

    public Match(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        matchId = counter++;
    }

    public void displayMatch() {
        System.out.println("===== MATCH " + matchId + " =====");
        System.out.println(p1.getName() + " VS " + p2.getName());
        System.out.println("Game: " + p1.getGame());
        System.out.println("Ranks: " + p1.getRank() + " vs " + p2.getRank());
    }
}
