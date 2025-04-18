import java.util.Scanner;

public class main{
    public static void main(String[] args){
        //create scanner object to read inprt from console
        Scanner input = new Scanner(System.in);

        //character creation
        System.out.print("Welcome to Java Command Line RPG\nWhat would you like to name yourself?: ");
        String playerName = input.nextLine();
        System.out.println("Welcome "+ playerName);
        System.out.println();


        //beginning of game loop
        System.out.println("You enter a fork in the road, do you left or right?");
        String user = input.nextLine().toLowerCase();
        System.out.println();
        if (user.equals("left")){
            System.out.println("You encounter an enemy!");
            goblin();
        } else {
            System.out.println("You continue your journey");
        }
        
}
    public static void goblin(){
        enemy goblin = new enemy("Goblin", 25, 5, 3);
        goblin.displayInfo();
    }

}