public class Electronics
{
    protected String manufacturer;
    protected double price;
    protected double weight;

    public Electronics(String manufacturer, double price, double weight){
	this.manufacturer = manufacturer;
	this.price = price;
	this.weight = weight;
	
    }
   
	public String toSring(){
	String result = "Manufacturer: " + manufacturer + " Price: " + price + " Weight: " + weight+ "\n";
	return result;
    }
}