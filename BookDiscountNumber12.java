import java.util.Scanner;
public class BookDiscountNumber12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print(" Enter the book category: ");
        String bookCategory = input12.nextLine();

        System.out.print(" Enter the number of books: ");
        int numberOfBooks = input12.nextInt();

        double discountAmount = 0.0;

        if (bookCategory.equalsIgnoreCase("dictionary") && numberOfBooks > 2) {
            discountAmount = 12.0;
          }  else if (bookCategory.equalsIgnoreCase("dictionary") && numberOfBooks < 2 ) {
                discountAmount = 10.0;

        } else if (bookCategory.equalsIgnoreCase("novel") && numberOfBooks >3) {
            discountAmount = 9.0;
            } else if (bookCategory.equalsIgnoreCase("novel") && numberOfBooks <= 3 ) {
                discountAmount = 8.0;

            }        else if (bookCategory.equalsIgnoreCase("other categories") && numberOfBooks >3) {
                discountAmount = 5.0;
          
          }
          System.out.println(" Discount amount: " + discountAmount + "%");
        } 
    }
    

