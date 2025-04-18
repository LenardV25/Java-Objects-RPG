import java.util.Scanner;

public class main{
    public static void main(String[] args){
        //create scanner object to read inprt from console
        Scanner input = new Scanner(System.in);

        //character creation
        System.out.println("Welcome to Java Command Line RPG");
        playerCreation();


        //beginning of game loop
        System.out.println("You enter a fork in the road, do you left or right?");
        String userChoice = input.nextLine().toLowerCase();
        System.out.println();
        

        if (userChoice.equals("left")){
            System.out.println("You encounter an enemy!");
            game();
        } else {
            System.out.println("You continue your journey");
        }
        
}

    public static void game(){
        //goblin();
        //player();
    }
    public static void goblin(){
        enemy goblin = new enemy("Goblin", 25, 5, 3);
        goblin.displayInfo();
    }
    public static void playerCreation(){
        //create scanner object to read inprt from console
        Scanner input = new Scanner(System.in);

        System.out.print("What would you like to name your character? \nName:");
        String choice = input.nextLine();
        System.out.println();
        player hero = new player(choice);
        hero.displayInfo();
    }
}