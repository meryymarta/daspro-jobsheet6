import java.util.Scanner;
public class Selection2Exp1Number12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

     
        System.out.print("Input the year = ");
        int year = input12.nextInt();
        
       
        //determine leap year
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Lap year");
            } else {
                System.out.println("Not a leap year");
            }
        }
       

    }} 
    

