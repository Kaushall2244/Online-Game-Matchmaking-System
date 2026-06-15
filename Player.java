public class Player {

    private int id;
    private String name;
    private String game;
    private int rank;

    public Player(int id, String name, String game, int rank) {
        this.id = id;
        this.name = name;
        this.game = game;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGame() {
        return game;
    }

    public int getRank() {
        return rank;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Game: " + game);
        System.out.println("Rank: " + rank);
    }
}
