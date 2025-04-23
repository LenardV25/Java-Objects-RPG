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

    //initailize player attack boost 
    public int attackBoost;

     //no attack boost until atk potion is used
     boolean atkBoost = false;

    public int bonusAttack = 10;
    public int bonusHealth = 10;

    public inventory(String playerName){
        this.playerName = playerName;
        this.attackPotions = 1;
        this.healthPotions = 1;
        this.attackBoost = 0;
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
        
    
    public boolean checkAtkBoost(){
        if (attackBoost > 0){
            //System.out.println();
            System.out.println("*This increased strength won't last...*");
            attackBoost--;
            System.out.println("Attack boosted turns left: "+this.attackBoost);
            bonusAttack = 10;
            return true;
        } 

        System.out.println("You feel your strength return to normal...");
        bonusAttack = 0;
        atkBoost=false;
        return false;          
    }

   public int attackPotion(){
    if (attackPotions <= 0){
        System.out.println("You've run out of attack potions!");
        return 0;

    } else {
        attackPotions--;
        System.out.println("You drink a potion of strength \npower grows within you temporarily...");
        
        //initialize atkboost timer and boolean
        //atkBoost =true;
        attackBoost = 5;
        bonusAttack = 0;
        //checkAtkBoost();
        return this.bonusAttack;
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
    

    

    
    
    
    
   

    

