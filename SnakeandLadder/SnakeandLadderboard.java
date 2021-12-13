import java.util.HashMap;
import java.util.Queue;

public class SnakeandLadderboard {
    private int size;
    private HashMap<Integer,snake> snakes; 
    private HashMap<Integer,Ladder> ladders;
    private Queue<Player> playerPieces;
    private int noOfDice;

    public SnakeandLadderboard(int size,int noOfDice,HashMap<Integer,snake> snakes,HashMap<Integer,Ladder> ladders,Queue<Player> playerPieces) {
        this.size = size;
        this.snakes = snakes;;
        this.ladders = ladders;
        this.playerPieces = playerPieces; 
        this.noOfDice = noOfDice;
    }
    public void startGame(){
        while(true){
            Player p = playerPieces.poll();
            Dice d = new Dice(noOfDice);
            int currloc = p.getLoc();
            int nextLoc = currloc + d.rollDice();
            
            if(nextLoc<=size){
                if(snakes.containsKey(nextLoc)){
                    nextLoc = snakes.get(nextLoc).getTail();
                    currloc = nextLoc;
                    System.out.println("snake hitted"+p.getName()+"at"+nextLoc);
                }
                else if(ladders.containsKey(nextLoc)){
                    nextLoc = ladders.get(nextLoc).getEnd();
                    currloc = nextLoc;
                    System.out.println("ladder upstare"+p.getName()+"to"+nextLoc);
                }
                else{
                    currloc = nextLoc;
                    System.out.println(p.getName()+"moved to "+currloc);
                }
                if(currloc == size){
                    System.out.println(p.getName());
                    System.out.println("won the game");
                    break;
                }
                p.setLoc(currloc);
            }
            playerPieces.add(p);

        }
    }

}