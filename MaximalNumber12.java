import java.util.Scanner;
public class MaximalNumber12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        
        System.out.print(" Enter the first number: ");
        int num1 = input12.nextInt();

        System.out.print(" Enter the second number: ");
        int num2 = input12.nextInt();

        System.out.print(" Enter the third number: ");
         int num3 = input12.nextInt();

         int max = num1;

         if (num2 > max) {
            max = num2;
         }

         if (num3 > max ) {
            max = num3;
         }

         System.out.println(" the maximum number is: " + max);

    }
    
}
