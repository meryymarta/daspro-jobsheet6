import java.util.Scanner;
public class ShoeStoreNumber12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print(" Enter the shoe brand: ");
        String brand = input12.nextLine();
        System.out.print(" Enter the category: ");
        String category = input12.nextLine();
        System.out.print(" Enter the size: ");
        int size = input12.nextInt();

        int price = 0;
        

        if (brand.equals("Converse")) {
            if (category.equals("Slip On")) {
                if (size  >= 36 && size <= 40) {
                    price = 8000000;
                }
            } else if (category.equals("High Top")) {
                if (size >= 40 && size <=44) {
                    price = 120000;
                }
            }
        } else if (brand.equals("Sketcher")) {
                if (category.equals("Woman")) {
                    if (size >= 36 && size <=41) {
                        price = 1000000;
                    }
                 } else if (category.equals("Man")) {
                        if (size >=41 && size <=44){
                            price = 1800000;
                        }
                    }
                } else if (brand.equals("Nike")) {
                    if (category.equals("Kids")) {
                        if (size >= 36 && size <= 40) {
                            price = 750000;
                        }
                    } else if (brand.equals("Adult")) {
                        if (size >=40 && size <=44) {
                            price = 150000;
                        }
                    }
                } System.out.println(" Price of shoe: Rp " + price);
            }
        } 
     
    

        
    
    

