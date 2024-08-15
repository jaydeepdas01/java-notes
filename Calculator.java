import java.util.Scanner;

public class Calculator {


    public static void main(String args[]){

        double num,result,a,b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        System.out.println("Enter 1 for add");
        System.out.println("Enter 1 for sub");
        System.out.println("Enter 1 for mul");
        System.out.println("Enter 1 for div");

        num = sc.nextDouble();

        if (num==1){
            System.out.println("Enter two number : ");
            a = sc.nextDouble();
            b = sc.nextDouble();

            result = a+b;
            System.out.printf("%f + %f = %f",a,b,result);
        } else if (num == 2) {
            System.out.println("Enter two number : ");
            a = sc.nextDouble();
            b = sc.nextDouble();

            result = a-b;
            System.out.printf("%f - %f = %f",a,b,result);
        }

     else if (num == 3) {
        System.out.println("Enter two number : ");
        a = sc.nextDouble();
        b = sc.nextDouble();

        result = a*b;
        System.out.printf("%f * %f = %f",a,b,result);
    }

     else if (num == 4) {
        System.out.println("Enter two number : ");
        a = sc.nextDouble();
        b = sc.nextDouble();

        result = a/b;
        System.out.printf("%f / %f = %f",a,b,result);
    }


else {
            System.out.println("Inavild number please Enter between 0 to 1");
        }

}
}
