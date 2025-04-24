import java.util.Scanner;

public class main{
    public static void main(String[] args){
        //create scanner object to read inprt from console
        Scanner input = new Scanner(System.in);

        //character creation
        System.out.println();
        System.out.println("Welcome to Java Command Line RPG");
        System.out.print("What would you like to name your character? \nName:");
        String name = input.nextLine();
        System.out.println();

    //initailize character stats
        player hero = new player(name, 50, 10,0);
        System.out.println("Hello "+ hero.playerName+ "!");
        

    //initailize inventory 
        inventory items = new inventory(name);
        

    //initailize enemy stats
        enemy giant = new enemy("Giant", 90, 10, 3);
        System.out.println();
   
    //start game
        System.out.println("You turn left and face against a giant");
        boolean quit = false; //flag controlling game loop


        //-- Main Game Loop --
        while(!quit){
        System.out.println();
        System.out.println(giant.displayInfo());
        
        //if atkboost is true, then they get additional atk damage added 
        if (items.atkBoost == true){
            items.attackBoost--;
            if (items.attackBoost > 0){
                System.out.println();
                System.out.println("*This increased strength won't last...*");
                System.out.println("Attack boosted for "+items.attackBoost+" turns");
                System.out.println();
                System.out.println(hero.displayInfo());
                
            }  
            if (items.attackBoost == 0){     //if atk boost timer runs out, they return to normal atk damage
                System.out.println();
                System.out.println("You feel your strength return to normal...");
                hero.attackDecrease(10);
                //System.out.println();
                //System.out.println(hero.displayInfo());
                items.atkBoost = false;
                
            }   
        } 

        if(items.atkBoost == false){ //if no atk boost, print normally 
            System.out.println();
            System.out.println(hero.displayInfo());
        }

        //--Main Character Actions--
        //input.nextLine();
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1: Attack Enemy");
        System.out.println("2: Check Inventory");
        System.out.println("3: Exit Game");
        System.out.print("Your Choice (1-3): ");
        int choice = input.nextInt();
        
            
        //Process based on user choice 
        switch(choice){
            case 1:
                System.out.println();
                hero.takeDamage(giant.attack());
                giant.takeDamage(hero.attack());
                break;

            case 2:
                boolean leaveBag = false;
        
                while(!leaveBag){
                    System.out.println();
                    System.out.println("This are your current items " + hero.playerName);
                    System.out.println("1) Attack Potions: "+ items.attackPotions+ " remaining\n2) Health Potions: "+ items.healthPotions+" remaining \n3) Return to battle"); 
                    switch(input.nextInt()){
                        case 1:
                        System.out.println();
                        hero.attackIncrease(items.attackPotion());
                        break;
                
                        case 2:
                        System.out.println();
                        hero.healthIncrease(items.healthPotion());
                        break;
        
                        default:
                        System.out.println();
                        System.out.println(("You take a deep breath before returning to battle..."));
                        leaveBag = true;
                    }
                }
                break;
               
            case 3:
                System.out.println();
                quit = true; //end game loop
                break;
                

            default:
                System.out.println();
                System.out.println("Invalid choice. Please enter number between 1 and 3");
                break;
        }
            //check if player has is died
            if (hero.isDefeated() == true){
                System.out.println("Our hero "+ hero.playerName + " has been slained!");
                System.out.println();
                System.out.println(hero.displayInfo());
                System.out.println();
                System.out.println("The battle has ended. Better luck next time "+ hero.playerName.toLowerCase()+ "!");
                quit = true; //end game loop

            } else if (giant.isDefeated()== true){
                System.out.println("Congratulations the "+ giant.name + " has taken too much damage and died!");
                System.out.println();
                System.out.println(giant.displayInfo());
                System.out.println();
                System.out.println(hero.levelUp());
                System.out.println();
                System.out.println("The battle had ended. Safe Travels "+ hero.playerName.toLowerCase()+ "!");
                quit = true; //end game loop

            } 

     } //end of while loop
     
    System.out.println("Thanks for playing!");
    input.close(); //close scanner to release system resources
        
       
}

}