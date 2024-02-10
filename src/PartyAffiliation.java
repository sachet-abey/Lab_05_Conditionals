import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your party affiliation: ");
        String partyAffiliation = scan.nextLine();
        if(partyAffiliation.equals("Democrat")) {
            System.out.println("You get a Democratic Donkey!");
        }
        else if(partyAffiliation.equals("Republican")) {
            System.out.println("You get a Republican Elephant!");
        }
        else if(partyAffiliation.equals("Independent")) {
            System.out.println("You get an Independent Person!");
        }
        else {
            System.out.println("You get an Other!");
        }
    }
}