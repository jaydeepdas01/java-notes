import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class practics1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float a,b,c,d,f,total=500;
        System.out.println("Enter the marks of 5 subject");

        System.out.println("English :=");
        a = sc.nextFloat();
//        System.out.println(a);

        System.out.println("Math := ");
        b = sc.nextFloat();
//        System.out.println(b);

        System.out.println("Physics := ");
        c = sc.nextFloat();
//        System.out.println(c);

        System.out.println("chemestry := ");
        d = sc.nextFloat();
//        System.out.println(d);

        System.out.println("computer := ");
        f = sc.nextFloat();
//        System.out.println(f);

        float sum = a+b+c+d+f;

        System.out.print("your total marks is := ");
        System.out.println(sum);

        float per = (sum/total)*100;
        System.out.print("Marks percentage is :=  "+ per +"%");
//        System.out.print(per);
//        System.out.println("%");






    }
}
