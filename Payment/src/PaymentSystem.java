import java.util.Scanner;

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your credit card number: ");
        String cardNumber = scanner.nextLine();
        String maskedCardNumber = maskCardNumber(cardNumber);
        
        System.out.print("Enter expiration date (MM/YY): ");
        String expirationDate = scanner.nextLine();
        String maskedExpiration = maskExpiration(expirationDate);
        
        System.out.print("Enter CVV: ");
        String cvv = scanner.nextLine();
        String maskedCvv = maskCvv(cvv);
        
        System.out.print("Enter the amount to pay: ");
        double amount = scanner.nextDouble();
        
        System.out.println("\nPayment Details:");
        System.out.println("Name: " + name);
        System.out.println("Card Number: " + maskedCardNumber);
        System.out.println("Expiration Date: " + maskedExpiration);
        System.out.println("CVV: " + maskedCvv);
        System.out.println("Amount: $" + amount);
        
        System.out.println("\nProcessing payment...");
        boolean isPaymentSuccessful = processPayment(cardNumber, expirationDate, cvv, amount);
        
        if (isPaymentSuccessful) {
            System.out.println("Payment successful! Thank you, " + name + ".");
        } else {
            System.out.println("Payment failed. Please try again.");
        }
        
        scanner.close();
    }
    
    public static boolean processPayment(String cardNumber, String expirationDate, String cvv, double amount) {
        if (amount <= 500) {
            return true;
        } else {
            return false;
        }
    }
    
    private static String maskCardNumber(String cardNumber) {
        if (cardNumber.length() <= 4) {
            return cardNumber;
        }
        return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
    }
    
    private static String maskExpiration(String expirationDate) {
        if (expirationDate.length() != 5 || expirationDate.charAt(2) != '/') {
            return expirationDate;
        }
        return "**/**";
    }
    
    private static String maskCvv(String cvv) {
        if (cvv.length() < 3) {
            return cvv;
        }
        return "***";
    }
}import java.util.Scanner;

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your credit card number: ");
        String cardNumber = scanner.nextLine();
        String maskedCardNumber = maskCardNumber(cardNumber);
        
        System.out.print("Enter expiration date (MM/YY): ");
        String expirationDate = scanner.nextLine();
        String maskedExpiration = maskExpiration(expirationDate);
        
        System.out.print("Enter CVV: ");
        String cvv = scanner.nextLine();
        String maskedCvv = maskCvv(cvv);
        
        System.out.print("Enter the amount to pay: ");
        double amount = scanner.nextDouble();
        
        System.out.println("\nPayment Details:");
        System.out.println("Name: " + name);
        System.out.println("Card Number: " + maskedCardNumber);
        System.out.println("Expiration Date: " + maskedExpiration);
        System.out.println("CVV: " + maskedCvv);
        System.out.println("Amount: $" + amount);
        
        System.out.println("\nProcessing payment...");
        boolean isPaymentSuccessful = processPayment(cardNumber, expirationDate, cvv, amount);
        
        if (isPaymentSuccessful) {
            System.out.println("Payment successful! Thank you, " + name + ".");
        } else {
            System.out.println("Payment failed. Please try again.");
        }
        
        scanner.close();
    }
    
    public static boolean processPayment(String cardNumber, String expirationDate, String cvv, double amount) {
        if (amount <= 500) {
            return true;
        } else {
            return false;
        }
    }
    
    private static String maskCardNumber(String cardNumber) {
        if (cardNumber.length() <= 4) {
            return cardNumber;
        }
        return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
    }
    
    private static String maskExpiration(String expirationDate) {
        if (expirationDate.length() != 5 || expirationDate.charAt(2) != '/') {
            return expirationDate; // Return as-is if format is unexpected
        }
        return "**/**";
    }
    
    private static String maskCvv(String cvv) {
        if (cvv.length() < 3) {
            return cvv;
        }
        return "***";
    }
}