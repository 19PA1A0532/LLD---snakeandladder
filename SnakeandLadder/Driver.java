import java.util.*;
public class Driver {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();

        System.out.println("Enter no of snakes");
        int noOfSnakes = sc.nextInt();
        HashMap<Integer,snake> snakes = new HashMap<Integer,snake>();
        for (int i = 0; i < noOfSnakes; i++) {
            int head = sc.nextInt();
            int tail = sc.nextInt();
            snake s = new snake(head,tail);
            snakes.put(head,s);
        }
        System.out.println("Enter no of ladders");

        int noOfLadders = sc.nextInt();
        HashMap<Integer,Ladder> ladders = new HashMap<Integer,Ladder>();
        for (int i = 0; i < noOfLadders; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            Ladder l = new Ladder(start,end);
            ladders.put(start,l);
        }
        System.out.println("noOfplayers");
        int noOfPlayers = sc.nextInt();
        Queue<Player> players = new LinkedList<Player>();
        for (int i = 0; i < noOfPlayers; i++) {
            players.add(new Player(sc.next()));
        }
        System.out.println("noOfdice");
        int noOfDice = sc.nextInt();
        SnakeandLadderboard sal = new SnakeandLadderboard(size,noOfDice,snakes, ladders, players);
        sal.startGame();
        //Dice d1 = new Dice(noOfDice);
        //System.out.println(d1.rollDice());
    }
}
