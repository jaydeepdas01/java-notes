import java.util.Scanner;

public class input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter two number for addition ");
        System.out.println("_______________________________");

        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.print("The sum of two number : ");
        System.out.print(sum);


    }
}
