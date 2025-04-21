import java.util.Scanner;

public class player{
    //scanner for user to press continue on
    Scanner readInput = new Scanner(System.in);

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
    //note: need to add public monster total keeping track of kills==>levels
    //level up mechanic
    /*public int levelUp(){
     * this.level+=1;
     * System.out.println();
     * System.out.println(this.playerName+" is now level "+ this.level);
    } */

    public String displayInfo(){
        String status= ("Character: "+ this.playerName + "\nHealth: " +this.healthPoints + "\nDamage: " +this.attackPower+ "\nLevel: " +this.level);
        return status;
    }

    public int attack(){
        System.out.println();
        System.out.println("You attack the enemy for "+ attackPower+ " damage!");
        return this.attackPower;
    }

    public int takeDamage(int amount){
        this.healthPoints-=amount;
        System.out.println();
        System.out.println(this.playerName + " took "+amount+" damage");
        return this.healthPoints;
    }

    public boolean isDefeated(){
        if (healthPoints <= 0 ){
            System.out.println();
            System.out.println("Oh no! "+ this.playerName+ " has taken too much damage");
            return true;
        }
        else return false;
      }
}