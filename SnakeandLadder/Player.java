public class Player {
    private String name;
    private int location =0;
    public Player(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getLoc(){
        return location;
    }
    public void setLoc(int setloc){
        this.location = setloc;
    }
}
