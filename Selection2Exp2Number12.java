import java.util.Scanner;
public class Selection2Exp2Number12 {
     public static void main(String[] args) {
       Scanner input12 =  new Scanner(System.in);

       

      System.out.print(" Input angle1: ");
      int angle1 = input12.nextInt();
      System.out.print(" Input angle2: ");
      int angle2 = input12.nextInt();
      System.out.print(" Input angle3: ");
      int angle3 = input12.nextInt();

       
       //calculate total angle
       int totalAngle = angle1 + angle2 + angle3;

       
       if (totalAngle ==180){
        if (angle1 == 90 || angle2 == 90 || angle3 ==90) {
            System.out.println(" Right triangle");
       } else if (angle1 == angle2 && angle2  == angle3) {
               System.out.println(" Equilateral triangle");
       } else if (angle1 == angle2|| angle1 == angle3 || angle2 == angle3) {
               System.out.println(" Isosceles triangle");
       }
        } else {
               System.out.println(" Not a triangle");
       }  
    }
}
