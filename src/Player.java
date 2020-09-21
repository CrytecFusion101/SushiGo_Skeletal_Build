public class Player {

    private String name;
    private Hand playerPile;

    public Player(String name){
        this.name = name;
        this.playerPile = new Hand();
    }

    public Hand pile(){
        return this.playerPile;
    }

}
