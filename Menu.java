package mainpackage;
import java.util.Scanner;
public class MenuSelection {

   public static void main(String args[]) {
       int userSelected;
	 int playerXP = 0;
	 int playerLevel = 1;
       do {
           userSelected = menuData();
           switch (userSelected) {
               case 1:
                   System.out.println("You have selected Scorpion");
               break;
               case 2:
                   System.out.println("You have selected Sub-Zero");
               break;
               case 3:
                   System.out.println("You have selected Johnny Cage.");
                   break;
               case 4:
                   System.out.println("You have selected Kenshi.");
                   break;
               case 5:
                   System.out.println("You have selected Kitana.");
                   break;
               case 6:
                   System.out.println("You have selected Jax.");
                   break;
               case 7:
                   System.out.println("You have selected Liu Kang.");
                   break;
               

               default:
           }
       }
               while(userSelected >7);
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
}


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class opponentSelection {
   public static void main(String args[]) {

       List<String> list = new ArrayList<>();

       list.add("Scorpion");
       list.add("Sub-Zero");
       list.add("Johnny Cage");
       list.add("Kenshi");
       list.add("Kitana");
       list.add("Jax");
       list.add("Liu Kang");

       opponentSelection obj= new opponentSelection();

       System.out.println("Your opponent is: " + obj.RandomElement(list));
   }

   public String RandomElement(List<String> list) {
     Random random = new Random();
     return list.get(random.nextInt(list.size()));
   }
}
