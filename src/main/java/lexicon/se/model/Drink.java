package lexicon.se.model;

public class Drink extends Product
{

    private boolean isSweet = true;


    public Drink (String productName, double price, int id, boolean isSweet)
    {
        super(2, 20, "Red Bull");
        this.isSweet = isSweet;
    }

    public boolean isSweet()
    {
        return isSweet;
    }


    @Override
    public String Examine ()
    {
        return "Name: " + getproductName() + " Price: " + getPrice() + " ID: " + getId() + " Sweet : " + isSweet;
    }

}
