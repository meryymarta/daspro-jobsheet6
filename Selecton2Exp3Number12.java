import java.util.Scanner;
public class Selecton2Exp3Number12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        
        //Declaration variable
        String category;
        int income, netSalary;
        double tax = 0;

        System.out.print("Input category = ");
        category = input12.nextLine();
        System.out.print("Input income = ");
        income = input12.nextInt();

        if(category.equals("worker")) {
            if (income <= 2000000)
                tax = 0.1;
            else if (income <= 3000000)
                tax = 0.15;
            else 
                tax = 0.2;
                netSalary = (int) (income - (tax * income));
                System.out.println("Net Salary = " + netSalary);
            } else if (category.equals("businessman")){
                if (income <= 2500000)
                    tax = 0.15;
                else if (income <= 3500000)
                    tax = 0.2;
                else 
                    tax = 0.25;
                netSalary = (int) (income - (tax * income));
                System.out.println("Net Salary = " + netSalary);

               }else 
                System.out.println("Invalid category!");
               }
                

            }

            
        
    


