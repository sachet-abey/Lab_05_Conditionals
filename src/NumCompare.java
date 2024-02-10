import java.util.Scanner;
public class NumCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNum;
        double secondNum;
        System.out.println("Enter the first number: ");
        if(scan.hasNextInt()) {
            firstNum = scan.nextInt();
            System.out.println("Enter the second number: ");
            if(scan.hasNextInt()) {
                secondNum = scan.nextInt();
                if(firstNum < secondNum) {
                    System.out.println("The first number you entered "+firstNum+" is the smaller number.");
                }
                else if(secondNum < firstNum) {
                    System.out.println("The second number you entered "+secondNum+" is the smaller number.");
                }
                else {
                    System.out.println("The two numbers you entered are equal.");
                }
            }
            else {
                System.out.println("Please try again!");
            }
        }
        else {
            System.out.println("Please try again!");
        }
    }
}