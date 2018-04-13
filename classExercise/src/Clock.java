public class Clock extends Home_Appliance{
    protected String currentTime;

    public Clock(String string, double price, double weight, String currentTime){
	super (string, price, weight);
	this.currentTime = currentTime;
    }
    public String room(){
	return "The room is the kitchen";
    }
    public String  getTime(){
	return currentTime;
    }
    public void setTime(String time){
	currentTime = time;
    }
    public String toString(){
	super.toString();
    }
}