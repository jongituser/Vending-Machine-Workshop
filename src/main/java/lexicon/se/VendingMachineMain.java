package lexicon.se;

import lexicon.se.model.AdvancedVendingMachine;
import lexicon.se.model.Product;

public class VendingMachineMain {

    public static void main(String[] args) {
        AdvancedVendingMachine vendingMachine = new AdvancedVendingMachine();

        // Add Currency
        vendingMachine.addCurrency(20);
        vendingMachine.addCurrency(50);
        vendingMachine.addCurrency(40);

        // Request Product
        int productId = 2;
        Product product = vendingMachine.requestProduct(productId);
        if (product != null) {
            System.out.println("Product information: " + product.getproductName());
        }

        // Get Description
        String description = vendingMachine.getDescription(productId);
        System.out.println("Product description: " + description);

        // Get Balance
        int balance = vendingMachine.getBalance();
        System.out.println("Your balance is: " + balance);

        // Get Products
        String[] availableProducts = vendingMachine.getProducts();
        System.out.println("Available Products: ");
        for (String productName : availableProducts) {
            System.out.println(productName);
        }

        // End Session
        int remainingBalance = vendingMachine.endSession();
        System.out.println("Session ended. Remaining Balance: " + remainingBalance);
    }
}