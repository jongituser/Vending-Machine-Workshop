package lexicon.se.model;

public interface VendingMachine
{
    void addCurrency(double amount);
    int getBalance();
    Product requestProduct (int id);
    int endSession();
    String getDescription(int id);
    String[] getProducts();
}
