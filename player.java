public class player{
    public String playerName;
    private int healthPoints;
    private int attackPower;
    private int level;


    public player(String playerName){
        this.playerName= playerName;
        this.healthPoints = 30;
        this.attackPower = 10;
        this.level = 1;
        
    }
    public String getName(){
        return this.playerName;

    }
    public void setName(String name){
        this.playerName = name;
    }

    //level up mechanic


    public void displayInfo(){
        System.out.println("Character: "+ this.playerName + "\nHealth: " +this.healthPoints + "\nDamage: " +this.attackPower+ "\nLevel: " +this.level);
    }

    public int attack(){
        System.out.println("You attack the enemy for "+ attackPower+ " damage!");
        return this.attackPower;
    }

    public int takeDamage(int amount){
        this.healthPoints-=amount;
        System.out.println(this.playerName + " took "+amount+" damage");
        return this.healthPoints;
    }

    public boolean isDefeated(){
        if (healthPoints <= 0 ){
            System.out.println("Our hero "+ this.playerName + " has been slained!");
            return true;
        }
        else return false;
      }
}