import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MatchmakingSystem sys = new MatchmakingSystem();

        int choice;             

        do {
            Menu.show();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Game Name: ");
                    String game = sc.nextLine();
                    System.out.print("Rank: ");
                    int rank = sc.nextInt();
                    sys.registerPlayer(new Player(id, name, game, rank));
                    break;
                case 2:
                    sys.viewWaitingPlayers();
                    break;
                case 3:
                    sys.createMatch();
                    break;
                case 4:
                    sys.viewHistory();
                    break;
                case 5:
                    System.out.print("Enter ID: ");
                    sys.removePlayer(sc.nextInt());
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}
