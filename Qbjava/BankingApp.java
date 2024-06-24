import java.util.*;

public class BankingApp {

    static class Account {
        private String fullName;
        private int birthYear;
        private String address;
        private String password;
        private String userId;
        private double balance;
        private String pin;

        // Constructor to initialize the account
        public Account(String fullName, int birthYear, String address, String password) {
            this.fullName = fullName;
            this.birthYear = birthYear;
            this.address = address;
            this.password = password;
            this.userId = generateUserId(fullName, birthYear);
            this.balance = 0.0;
            this.pin = null;
        }

        // Method to generate a unique user ID
        private static String generateUserId(String fullName, int birthYear) {
            return fullName.substring(0, 3) + birthYear + new Random().nextInt(1000);
        }

        // Method to display account details
        public void displayAccountDetails() {
            System.out.println("Account Details:");
            System.out.println("Full Name: " + fullName);
            System.out.println("Birth Year: " + birthYear);
            System.out.println("Address: " + address);
            System.out.println("User ID: " + userId);
            System.out.println("Balance: " + balance);
        }

        // Method to calculate interest
        public void calculateInterest() {
            double interestRate = 0.03; // 3% interest rate
            double interest = balance * interestRate;
            System.out.println("Interest earned: $" + interest);
        }

        // Method to set the account PIN
        public void setPin(String newPin) {
            if (newPin.length() == 4 && newPin.matches("[0-9]+")) {
                pin = newPin;
                System.out.println("PIN set successfully.");
            } else {
                System.out.println("PIN must be 4 digits long.");
            }
        }

        // Method to verify password
        public boolean verifyPassword(String inputPassword) {
            return this.password.equals(inputPassword);
        }

        // Get the user ID
        public String getUserId() {
            return userId;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Account> accounts = new HashMap<>();

        // Create a new account
        System.out.println("Account Registration");
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter password (minimum 8 characters): ");
        String password = scanner.nextLine();

        // Password validation
        while (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long. Please try again.");
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        }

        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        // Check if the password and confirm password match
        while (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match. Please try again.");
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            System.out.print("Confirm password: ");
            confirmPassword = scanner.nextLine();
        }

        // Create an account
        Account account = new Account(fullName, birthYear, address, password);
        accounts.put(account.getUserId(), account);
        System.out.println("Account created successfully!");
        System.out.println("Your User ID: " + account.getUserId());

        // User login
        System.out.println("\nUser Login");
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        Account currentAccount = accounts.get(userId);
        if (currentAccount != null && currentAccount.verifyPassword(inputPassword)) {
            System.out.println("Login successful!");

            // Banking operations
            boolean exit = false;
            while (!exit) {
                System.out.println("\nBanking Operations:");
                System.out.println("1. View account details");
                System.out.println("2. Calculate interest");
                System.out.println("3. Set PIN");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();
                scanner.nextLine(); // consume the newline character

                switch (option) {
                    case 1:
                        currentAccount.displayAccountDetails();
                        break;
                    case 2:
                        currentAccount.calculateInterest();
                        break;
                    case 3:
                        System.out.print("Enter a 4-digit PIN: ");
                        String pin = scanner.nextLine();
                        currentAccount.setPin(pin);
                        break;
                    case 4:
                        System.out.println("Exiting the application.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        } else {
            System.out.println("Invalid User ID or password.");
        }

        // Close the scanner
        scanner.close();
    }
}
