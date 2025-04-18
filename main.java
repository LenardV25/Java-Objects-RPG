import java.util.Scanner;

public class main{
    public static void main(String[] args){
        //create scanner object to read inprt from console
        Scanner input = new Scanner(System.in);

        //character creation
        System.out.println("Welcome to Java Command Line RPG");
        System.out.print("What would you like to name your character? \nName:");
        String name = input.nextLine();
        System.out.println();
        player hero = new player(name);

        boolean quit = false; //flag controlling game loop

        //-- Main Game Loop --
        while(!quit){
        System.out.println(hero.displayInfo());
        //System.out.println("You enter a fork in the road, do you left or right?");
        //String userChoice = input.nextLine().toLowerCase();
        System.out.println();//spacer

        System.out.println("You turn left and face against a giant");
        enemy giant = new enemy("Giant", 40, 10, 3);
        System.out.println(giant.displayInfo());
        System.out.println();
        
        //--Main Character Actions--
        System.out.println("What would you like to do?");
        System.out.println("1: Attack Enemy");
        System.out.println("2: Retreat");
        System.out.println("3: Exit Game");
        System.out.print("Your Choice (1-3): ");
        
        int choice = input.nextInt();
        //while (choice > 3 & choice < 1){
            //System.out.print("Invalid Choice. Please enter number between 1 and 3: ");
            //input.nextInt();
        //}

        //Process based on user choice
        switch(choice){
            case 1:
                //System.out.println();
                hero.attack();
                System.out.println(hero.displayInfo());
                System.out.println();
                System.out.println(giant.displayInfo());
                break;

            case 2:
                System.out.println();
                hero.takeDamage(5);
                break;

            case 3:
                System.out.println();
                quit = true;
                break;

            default:
                System.out.println();
                System.out.println("Invalid choice. Please enter number between 1 and 3.");
                

            //check if player has is died
            if (hero.isDefeated()){
                System.out.println("Oh no! "+ hero.playerName+ " has taken too much damage");
                System.out.println(hero.displayInfo());
                System.out.println("The simulation ends. Better luck next time!");
                quit = true; //end game loop
            } else if (giant.isDefeated()){
                System.out.println("Congratulations "+ giant.name + " has taken too much damage and died!");
                System.out.println(giant.displayInfo());
                System.out.println("The simulation ends. Safe Travels"+ hero.playerName.toUpperCase()+ "!");
                quit = true; //end game loop
            }
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