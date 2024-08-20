package Client;

import java.util.Scanner;

import Application.GSShopFactory;
import Application.GSNormalAcc;
import Application.GSprimeAcc;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GSShopFactory factory = new GSShopFactory();

        GSprimeAcc primeAcc = null;
        GSNormalAcc normalAcc = null;

        while (true) {
            System.out.println("\n1. Create New Prime Account");
            System.out.println("2. Create New Normal Account");
            System.out.println("3. Print Account Details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    long accNoPrime = scanner.nextLong();
                    scanner.nextLine();  
                    System.out.print("Enter Account Name: ");
                    String accNmPrime = scanner.nextLine();
                    System.out.print("Enter Charges: ");
                    float chargesPrime = scanner.nextFloat();
                    System.out.print("Is Prime (true/false): ");
                    boolean isPrime = scanner.nextBoolean();
                    
                    primeAcc = factory.getNewPrimeAcc((int) accNoPrime, accNmPrime, chargesPrime, isPrime);
                    System.out.println("Prime Account Created Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    long accNoNormal = scanner.nextLong();
                    scanner.nextLine(); 
                    System.out.print("Enter Account Name: ");
                    String accNmNormal = scanner.nextLine();
                    System.out.print("Enter Charges: ");
                    float chargesNormal = scanner.nextFloat();
                    System.out.print("Enter Delivery Charges: ");
                    float deliveryCharges = scanner.nextFloat();
                    
             
                    normalAcc = factory.getNewNormalAcc((int) accNoNormal, accNmNormal, chargesNormal, deliveryCharges);
                    System.out.println("Normal Account Created Successfully!");
                    break;

                case 3:
                    if (primeAcc != null) {
                        System.out.println(primeAcc.toString());
                    } else if (normalAcc != null) {
                        System.out.println(normalAcc.toString());
                    } else {
                        System.out.println("No account has been created yet.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
