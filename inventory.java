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

    
    public int bonusAttack = 10;
    public int bonusHealth = 10;

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

    public void displayInvent(){
        System.out.println("This are your current items " + this.playerName);
        System.out.println("1) Health Potions: "+ this.healthPotions+ " remaining\n2) Attack Potions: "+ this.attackPotions+" remaining \n3) Return to battle"); 
        /* 
        boolean leaveBag = false;

        while(!leaveBag){
            
            switch(readInput.nextInt()){
                case 1:
                //System.out.println("Using health potion");
                attackPotion();
                break;
        
                case 2:
                //System.out.println("using attack potion");
                healthPotion();
                
                break;

                default:
                System.out.println(("You take a deep breath before returning to battle..."));
                leaveBag = true;
                /* 
                System.out.println("Press enter to leave inventory: ");
                enterkey = readInput.nextLine();
                if (enterkey.equals("")){
                    System.out.println();
                }
                */
    }
        
    
    

    

   public int attackPotion(){
    if (attackPotions <= 0){
        System.out.println("You've run out of attack potions!");
        //displayInvent();
        return 0;
    } else {
    System.out.println("You drink a potion of strength \nyou power grows within you temporarily...");
    //System.out.println(bonusAttack + attackPower);
    attackPotions--;
    return bonusAttack;
    }
   }

   public int healthPotion(){
    if (healthPotions <= 0){
        System.out.println("You've run out of health potions!");
        //displayInvent();
        return 0;
    } else {
        System.out.println("You drink a potion of healing \nyour wounds begin to heal rapidly... ");
        //System.out.println(bonusHealth +healthPoints);
        healthPotions--;
        return bonusHealth;
    }
    
   }


}
    

    

    
    
    
    
   

    

