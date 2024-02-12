import java.util.Scanner; // Import Scanner from Java

public class ShipCostCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Initialize a scanner to read user input
        System.out.println("Enter the price of an item: "); // Prompts user to enter price of an item
        double shippingCosts; // Initialize shipping costs variable
        if(scan.hasNextDouble()) { // If the next input can be read as a double
            double itemPrice = scan.nextDouble(); // Get item price input
            if(itemPrice >= 100) { // If item price is greater than or equal to 100, shipping costs are free
                shippingCosts = 0.00;
            }
            else { // Otherwise, the shipping costs is 2% of the item price (multiply item price by 2/100)
                shippingCosts = itemPrice * 2/100;
            }
            double totalPrice = itemPrice + shippingCosts; // The total price is calculated by adding the item price and the shipping costs
            System.out.println("The shipping costs is $"+shippingCosts+" and the total price is $"+totalPrice); // Return results for shipping costs and total price
        }
    }
}
