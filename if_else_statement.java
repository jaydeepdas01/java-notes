import java.util.Scanner;

public class if_else_statement {
    public static void main(String args[]){

        int x ;
        Scanner sc = new Scanner(System.in);
         x = sc.nextInt();


         if(x%2==0){
             System.out.printf("%d is a even number",x);
         }
         else {
             System.out.printf("\n%d is a odd number ",x);
         }
    }
}
