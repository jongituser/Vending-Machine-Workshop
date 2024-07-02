package lexicon.se.model;

public abstract class Product {

    private int id;
    private double price;
    private String ProductName;

    public void Products(int id, double price, String ProductName) {

        this.id = id;
        this.price = price;
        this.ProductName = ProductName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }


}



