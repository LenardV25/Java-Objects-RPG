import java.util.ArrayList;
import java.util.Scanner;

public class inventory {
    //ArrayList<String> items = new ArrayList<String>();

    //scanner for user to press continue on
    Scanner readInput = new Scanner(System.in);

    public String enterkey;
    public String playerName;
    public int healthPotions;
    public int attackPotions;

    public inventory(String playerName){
        this.playerName = playerName;
        this.attackPotions = 1;
        this.healthPotions = 1;
    }

    public String getName(){
        return this.playerName;

    }
    public void setName(String name){
        this.playerName = name;
    }

    public String displayInvent(){
        System.out.println("This are your current items " + this.playerName);
        System.out.println("Health Potions: "+ this.healthPotions+ "\nAttack Potions: "+ this.attackPotions);
        String status = "";
        
        System.out.println("press enter to continue: ");
        enterkey = readInput.nextLine();
        if (enterkey.equals("")){
            System.out.println();
        }
        return status;
    }


}
    

    

    
    
    
    
   

    

