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
        player hero = new player(name, 30, 10,1);
        System.out.println("Hello "+ hero.playerName+ "!");
        

    //initailize inventory 
        inventory items = new inventory(name);
        //System.out.println("This are your items: ");

    //initailize enemy stats
        enemy giant = new enemy("Giant", 40, 10, 3);
        System.out.println();

    //start game
        System.out.println("You turn left and face against a giant");
        boolean quit = false; //flag controlling game loop

        //-- Main Game Loop --
        while(!quit){
        //System.out.println("You enter a fork in the road, do you left or right?");
        //String userChoice = input.nextLine().toLowerCase();
        System.out.println();//spacer
        System.out.println(hero.displayInfo());
        System.out.println();
        System.out.println(giant.displayInfo());
        System.out.println();
        
        //--Main Character Actions--
        //input.nextLine();
        System.out.println("What would you like to do?");
        System.out.println("1: Attack Enemy");
        System.out.println("2: Reposition");
        System.out.println("3: Check Inventory");
        System.out.println("4: Exit Game");
        System.out.print("Your Choice (1-4): ");
        int choice = input.nextInt();
        
        //Process based on user choice 
        switch(choice){
            case 1:
                System.out.println();
                hero.attack();
                hero.takeDamage(5);
                giant.takeDamage(hero.attack());
                break;

            case 2:
                System.out.println();
                hero.takeDamage(10);
                break;

            case 3:
                System.out.println();
                //items.displayInvent();
                System.out.println("This are your current items " + hero.playerName);
                boolean leaveBag = false;
        
                while(!leaveBag){
                    System.out.println("1) Attack Potions: "+ items.attackPotions+ " remaining\n2) Health Potions: "+ items.healthPotions+" remaining \n3) Return to battle"); 
                    switch(input.nextInt()){
                        case 1:
                        System.out.println();
                        hero.attackIncrease(items.attackPotion());
                        break;
                
                        case 2:
                        System.out.println();
                        hero.healthIncrease(items.healthPotion());
                        //items.healthPotion();
                        
                        break;
        
                        default:
                        System.out.println(("You take a deep breath before returning to battle..."));
                        leaveBag = true;
                    }
                }
                //hero.healthIncrease(items.healthPotion());
                //items.displayInvent();
                
                break;
               
            case 4:
                System.out.println();
                //System.out.println("Safe Travels "+ hero.playerName.toLowerCase()+ "!");
                quit = true; //end game loop
                break;
                

            default:
                System.out.println();
                System.out.println("Invalid choice. Please enter number between 1 and 3.");
                System.out.println("1: Attack Enemy");
                System.out.println("2: Retreat");
                System.out.println("3: Exit Game");
                System.out.println("Your Choice (1-3): ");
                input.nextInt();
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
                System.out.println("The battle had ended. Safe Travels "+ hero.playerName.toLowerCase()+ "!");
                quit = true; //end game loop
            } 

     } //end of while loop

    System.out.println("Thanks for playing!");
    input.close(); //close scanner to release system resources
        
       
}

    public static void game(){
        //goblin();
        //player();
    }
    public static void goblin(){
        enemy goblin = new enemy("Goblin", 25, 5, 3);
        goblin.displayInfo();
    }
    public static void player(){
        
    }
}