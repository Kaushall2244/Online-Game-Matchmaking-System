
import java.util.*;

public class MatchmakingSystem {

    private ArrayList<Player> waitingPlayers = new ArrayList<>();
    private ArrayList<Match> matchHistory = new ArrayList<>();

    public void registerPlayer(Player p) {
        waitingPlayers.add(p);
        System.out.println("Player registered.");
    }

    public void viewWaitingPlayers() {
        if (waitingPlayers.isEmpty()) {
            System.out.println("No waiting players.");
            return;
        }
        for (Player p : waitingPlayers) {
            System.out.println("----------------");
            p.display();
        }
    }

    public void removePlayer(int id) {
        Iterator<Player> it = waitingPlayers.iterator();
        while (it.hasNext()) {
            Player p = it.next();
            if (p.getId() == id) {
                it.remove();
                System.out.println("Removed.");
                return;
            }
        }
        System.out.println("Player not found.");
    }

    public void createMatch() {
        for (int i = 0; i < waitingPlayers.size(); i++) {
            for (int j = i + 1; j < waitingPlayers.size(); j++) {
                Player a = waitingPlayers.get(i);
                Player b = waitingPlayers.get(j);
                if (a.getGame().equalsIgnoreCase(b.getGame()) && Math.abs(a.getRank() - b.getRank()) <= 100) {
                    Match m = new Match(a, b);
                    matchHistory.add(m);
                    m.displayMatch();
                    waitingPlayers.remove(j);
                    waitingPlayers.remove(i);
                    return;
                }
            }
        }
        System.out.println("No suitable match found.");
    }

    public void viewHistory() {
        if (matchHistory.isEmpty()) {
            System.out.println("No matches yet.");
            return;
        }
        for (Match m : matchHistory) {
            m.displayMatch();
        }
    }
}
