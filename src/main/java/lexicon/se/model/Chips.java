package lexicon.se.model;

public class Chips extends Product
{

    String flavor;

    public Chips (String productName, double price, int id, String flavor)
    {
        super(10, 30, "Chips Bag");
        this.flavor = flavor;
    }

    public String getFlavor ()
        {
            return flavor;
        }

        public void setFlavor ()
        {
            this.flavor = flavor;
        }

        @Override

        public String Examine ()
        {
            return "ID: " + getId() + "Price: " + getPrice() + "Name: " + getproductName() + "Flavor: " + flavor;
        }





}
