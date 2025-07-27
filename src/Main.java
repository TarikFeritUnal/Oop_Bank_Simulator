import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        System.out.print("Please enter your balance: ");
        double balance = sc.nextDouble();

        OopBank newAccount = new OopBank(balance, name);

        // System.out.println(newaccount);  bunun çıktısı normal olmaz bellekteki adresi referans değerini yazdırır hesabın detaylarını yazmaz.örnek çıktısı: OopBank@6e2c634b

        while (true) {
            System.out.println("\nHello " + name + "! Please select a bank transaction:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int selection = sc.nextInt();

            switch (selection) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    newAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    newAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    newAccount.checkBalance();
                    break;
                case 4:
                    System.out.print("Are you sure you want to exit? (y/n): ");
                    String confirmExit = sc.next();
                    if (confirmExit.equalsIgnoreCase("y")) {
                        System.out.println("Exiting the system. Goodbye!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid selection! Please try again.");
            }
        }
    }
}