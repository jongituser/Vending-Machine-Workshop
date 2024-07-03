package lexicon.se.model;

public class Candy extends Product

{
    private String type;

    public Candy (String productName, double price, int id, String type)
    {
        super(12, 10, "Candy Bar");
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override

    public String Examine ()
    {
        return "ID: " + getId() + "Price: " + getPrice() + "Name: " + getproductName() + "Type: " + type;
    }
}
