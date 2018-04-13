public class Cell_Phone extends Portable_Electronics{
    
    protected String phoneNumber;
    protected Boolean hasCamera;

    public Cell_Phone(String string, double price, double weight, String phoneNumber, Boolean hasCamera){
	super (string, price, weight);
	this.phoneNumber = phoneNumber;
	this.hasCamera = hasCamera;    
    }
    public String batteryType(){
	return "The battery type is AAA";
    }
    public String number(){
	return " The phone number is " + phoneNumber;
    }
    public Boolean takePictures(){
	return hasCamera;
    }
    @Override
    public String toString(){
	return "Manufacturer: " + manufacturer +"Price: " + price +"Weight: " + weight+"PhoneNumber: "+phoneNumber +"Has a Camera: " +hasCamera;
    }
}