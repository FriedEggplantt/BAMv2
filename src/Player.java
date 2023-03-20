public class Player {
    String name;
    int health = 600;

    public Player(String name, int health){
        this.name = name;
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void damage(int damage){
        this.health = health-damage;
    }
}
