import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuSelection;
        do {
            System.out.println("Please select an option:");
            System.out.println("1. Cups to Teaspoons");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. US Gallons to Imperial Gallons");
            System.out.println("4. Quit");
            menuSelection = sc.nextInt();
            double quantity; 
            switch(menuSelection) {
                case 1:
                    System.out.println("What is the quantity you would like to convert?");
                    quantity = sc.nextDouble();
                    double cupsToTBSP = quantity * 48.0;
                    System.out.println(String.format("%.1f", quantity) + " cups is " + String.format("%.1f", cupsToTBSP) + " teaspoons.");
                    break;
                
                case 2:
                    System.out.println("What is the quantity you would like to convert?");
                    quantity = sc.nextDouble();
                    double milesToKM = quantity * 1.60934;
                    System.out.println(String.format("%.1f", quantity) + " miles is " + String.format("%.4f", milesToKM) + " kilometers.");
                    break;
                
                case 3:
                    System.out.println("What is the quantity you would like to convert?");
                    quantity = sc.nextDouble();
                    double gallonToIG = quantity * 0.832674;
                    System.out.println(String.format("%.1f", quantity) + " US Gallons is " + String.format("%.6f", gallonToIG) + " Imperial Gallons.");
                    break;
                
                case 4:
                    System.out.println("Thanks for playing!");
                    break;
                
                default:
                    System.out.println("Invalid input.");
            }
            System.out.println();
        } while(menuSelection != 4);
	}
}
