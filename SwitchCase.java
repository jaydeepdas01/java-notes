import java.util.Scanner;

public class SwitchCase {

   public static void main(String args[]){

       Scanner sc= new Scanner(System.in);

       System.out.println("Enter Between 1  to 3");

       int n = sc.nextInt();

       switch (n){

           case 1:
               System.out.println("Hello");
               break;
           case 2:
               System.out.println("Namaste");
               break;

           case 3:
               System.out.println("How are you!!");
               break;

           default:
               System.out.println("Invalid input");

       }

   }
}
                                                                    