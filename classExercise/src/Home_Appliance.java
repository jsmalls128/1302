public abstract class Home_Appliance extends Electronics
{    
    public Home_Appliance(String string, double price, double weight)
    {
	super (string, price, weight);
    }
    public abstract String room();

    public abstract String toString();
    
}