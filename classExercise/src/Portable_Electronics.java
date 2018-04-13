public abstract class Portable_Electronics extends Electronics{

    public Portable_Electronics(String manufacturer, double price, double wieght){
	super (manufacturer,price,wieght);
    }
    public abstract String batteryType();
}