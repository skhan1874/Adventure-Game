package mainpackage;
import java.util.Scanner;

//Menu
public class Menu {
   public static void main(String args[]) {
       int userSelected;			   //the player the user chose
       int userHealth = 35;
       int aiHealth = 35;
       boolean playerSelected = false;
       do {
           userSelected = menuData();
           int aiCharacter = (int) (Math.random() * 7);
           switch (userSelected) {
               case 1 -> System.out.println("You have selected Scorpion");
               case 2 -> System.out.println("You have selected Sub-Zero");
               case 3 -> System.out.println("You have selected Johnny Cage.");
               case 4 -> System.out.println("You have selected Kenshi.");
               case 5 -> System.out.println("You have selected Kitana.");
               case 6 -> System.out.println("You have selected Jax.");
               case 7 -> System.out.println("You have selected Liu Kang.");
               default -> {
               }
           }
           switch (aiCharacter) {
               case 1 -> System.out.println("You're playing against Kratos");
               case 2 -> System.out.println("You're playing against Freddy Krueger");
               case 3 -> System.out.println("You're playing against Jason Voorhees");
               case 4 -> System.out.println("You're playing against Predator");
               case 5 -> System.out.println("You're playing against Alien");
               case 6 -> System.out.println("You're playing against Leatherface");
               case 7 -> System.out.println("You're playing against Spawn");
           }
       }
       while (userSelected > 7 && !playerSelected);
       playerSelected = true;
       if (playerSelected)
           userChoice(true, aiHealth, userHealth);


   }

   public static int menuData() {
       int selection;
       Scanner sc = new Scanner(System.in);
       // Display menu
       System.out.println("*** Choose Your Fighter ***");

       System.out.println("1 - Scorpion");
       System.out.println("2 - Sub-Zero");
       System.out.println("3 - Johnny Cage");
       System.out.println("4 - Kenshi");
       System.out.println("5- Kitana");
       System.out.println("6- Jax");
       System.out.println("7- Liu Kang");


       System.out.println("Your selected fighter is:");
       selection = sc.nextInt();

       return selection;
   }
//Afam, Robert, and Erin
   public static void userMove(int aiHealth, int userHealth) {
       int damage;
       int damage2;
       int move;
       int MAX_HEALTH = 35;
       int totalDamage = 0;
       int totalDamage2 = 0;
       Scanner choice = new Scanner(System.in);
       while (userHealth > 0 && aiHealth > 0) {
           System.out.println("Pick a move (Click enter to continue)" + "\n" + "Punch - 1, Kick - 2, Slap - 3, Punch + kick - 4, slap + punch - 5, kick + slap - 6");
           move = choice.nextInt();
           int aiMove = (int) (Math.random() * 6);
           if (move < 0 && move > 6) {
               System.out.println("Please type in a number between 1 and 6");
           }
           if (move == 1) {
               System.out.println("Your move will be Punch" + "\n" + "You damaged the opponent by 5 pts");
               damage = 5;
               totalDamage += damage;
               //break;
           } else if (move == 2) {
               System.out.println("Your move will be Kick" + "\n" + "you damaged the opponent by 8 pts");
               damage = 8;
               totalDamage += damage;
               //break;
           } else if (move == 3) {
               System.out.println("Your move will be a slap " + "\n" + "you damaged the opponent by 3 pts");
               damage = 3;
               totalDamage += damage;
               //break;
           } else if (move == 4) {
               System.out.println("Your move will be a Punch + Kick" + "\n" + "you damaged the opponent by 9 pts");
               damage = 9;
               totalDamage += damage;
               //break;
           } else if (move == 5) {
               System.out.println("Your move will be a Slap + Punch" + "\n" + "you damaged the opponent by 8 pts");
               damage = 5;
               totalDamage += damage;
               //break;
           } else {
               move = 6;
               System.out.println("Your move will be a Kick + Slap" + "\n" + "you damaged the opponent by 10 pts");
               damage = 10;
               totalDamage += damage;
               //break;
           }
           aiHealth = MAX_HEALTH - totalDamage;
           if (aiMove == 1) {
               System.out.println("Enemy's move will be Punch" + "\n" + "You will be damaged  by 5 pts");
               damage2 = 5;
               totalDamage2 += damage2;
           } else if (aiMove == 2) {
               System.out.println("Enemy's move will be Kick" + "\n" + "You will be damaged  by 8 pts");
               damage2 = 8;
               totalDamage2 += damage2;
           } else if (aiMove == 3) {
               System.out.println("Enemy's move will be a slap " + "\n" + "You will be damaged  by 3 pts");
               damage2 = 3;
               totalDamage2 += damage2;
           } else if (aiMove == 4) {
               System.out.println("Enemy's move will be a Punch + Kick" + "\n" + "You will be damaged  by 9 pts");
               damage2 = 9;
               totalDamage2 += damage2;
           } else if (aiMove == 5) {
               System.out.println("Enemy's move will be a Slap + Punch" + "\n" + "You will be damaged  by 8 pts");
               damage2 = 8;
               totalDamage2 += damage2;
           } else {
               aiMove = 6;
               System.out.println("Enemy's move will be a Kick + Slap" + "\n" + "You will be damaged by 10 pts");
               damage2 = 10;
               totalDamage2 += damage2;
           }
           userHealth = MAX_HEALTH - totalDamage2;
           System.out.println("The opponent's health is " + aiHealth + "\n" + "Your health is " + userHealth);
       }
       if (aiHealth < userHealth) {
           System.out.println("Player 1 is the winner!");
           System.out.println("You inflicted " + totalDamage + " damage and your opponent damaged you by " + totalDamage2 + " points");

       }
       if (userHealth < aiHealth) {
           System.out.println("You lose!");
       }
       System.out.println("If you want to play again, press 1. If you want to exit press 2");
       Scanner p = new Scanner(System.in);
       int key = p.nextInt();
       switch (key) {
           case 1:
               main(null);
               break;
       }
       switch (key) {
           case 2:
               System.out.println("Thanks for playing!");
               break;
       }
   }

   public static void userChoice(boolean playerSelected, int aiHealth, int userHealth) {
       userMove(aiHealth, userHealth);

   }
}
