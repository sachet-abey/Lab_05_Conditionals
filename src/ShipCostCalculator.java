import java.util.Scanner;

public class ShipCostCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of an item: ");
        double shippingCosts;
        if(scan.hasNextDouble()) {
            double itemPrice = scan.nextDouble();
            if(itemPrice >= 100) {
                shippingCosts = 0.00;
            }
            else {
                shippingCosts = itemPrice * 2/100;
            }
            double totalPrice = itemPrice + shippingCosts;
            System.out.println("The shipping costs is $"+shippingCosts+" and the total price is $"+totalPrice);
        }
    }
}
