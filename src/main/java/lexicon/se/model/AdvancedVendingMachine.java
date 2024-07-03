package lexicon.se.model;

public class AdvancedVendingMachine implements VendingMachine {

    private Product[] products;
    private double balance;

    // List of acceptable currency values
    private final int[] acceptedCurrencies = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};

    // Constructor initializes the vending machine with products
    public AdvancedVendingMachine() {
        products = new Product[3];
        products[0] = new Drink("Cola", 15, 1, true);
        products[1] = new Candy("Snickers", 20, 2, "Chocolate");
        products[2] = new Chips("OLW", 30, 3, "Dill");
        balance = 0;
    }

    // Helper method to check if the currency value is acceptable
    private boolean isAcceptedCurrency(double amount) {
        for (int currency : acceptedCurrencies) {
            if (currency == amount) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addCurrency(double amount) {
        if (isAcceptedCurrency(amount)) {
            balance += amount;
            System.out.println("Added: " + amount + " to balance. Current balance: " + balance);
        } else {
            System.out.println("Cannot add current currency: " + amount);
        }
    }

    @Override
    public int getBalance() {
        return (int) balance;
    }

    @Override
    public Product requestProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                if (balance >= product.getPrice()) {
                    balance -= product.getPrice();
                    System.out.println("Dispensed: " + product.getproductName() + ". New balance: " + balance);
                    return product;
                } else {
                    System.out.println("Insufficient balance to purchase: " + product.getproductName());
                    return null;
                }
            }
        }
        System.out.println("Product not found.");
        return null;
    }

    @Override
    public int endSession() {
        int remainingBalance = (int) balance;
        balance = 0.0;
        return remainingBalance;
    }

    @Override
    public String getDescription(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product.Examine();
            }
        }
        return "There is no product with this ID";
    }

    @Override
    public String[] getProducts() {
        String[] productNames = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productNames[i] = "ID: " + products[i].getId() + ", Name: " + products[i].getproductName() + ", Price: " + products[i].getPrice();
        }
        return productNames;
    }
}