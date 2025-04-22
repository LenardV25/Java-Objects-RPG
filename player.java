import java.util.Scanner;

public class player{
    //scanner for user to press continue on
    Scanner readInput = new Scanner(System.in);

    public String playerName;
    public int healthPoints;
    public int attackPower;
    private int level;

     
    

    public player(String playerName, int healthPoints, int attackPower, int level){
        this.playerName= playerName;
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
        this.level = level;
        
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

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;

    }

    public int getAttackPower(){
        return this.attackPower;
    }

    public void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }

    public int getLevel(){
        return this.level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public String displayInfo(){
        String status= ("Character: "+ this.playerName + "\nHealth: " +this.healthPoints + "\nDamage: " +this.attackPower+ "\nLevel: " +this.level);
        return status;
    }

    public int attack(){
        //System.out.println();
        //System.out.println("You attack the enemy for "+ this.attackPower+ " damage!");
        return this.attackPower;
    }

    public int takeDamage(int amount){
        this.healthPoints-=amount;
        System.out.println();
        System.out.println(this.playerName + " took "+amount+" damage");
        return this.healthPoints;
    }

    public int attackIncrease(int bonusAttack ){

        this.attackPower+=bonusAttack;
        return this.attackPower;
    }

    public int healthIncrease(int bonusHealth){

        this.healthPoints+=bonusHealth;
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