public class HourlyEmployee extends Personal{
    
    private int EmployeeId;
    private int rate;
    private int numbHours;

    HourlyEmployee(String fname, String lname, int EmployeeId, int rate, int numbHours){
	super(fname,lname);
	this.EmployeeId = EmployeeId;
	this.rate = rate;
	this.numbHours = numbHours;
    }
    public int getEmployeeId(){
	return EmployeeId;
    }
    public int getRate(){
	return rate;
    }
    public int getNumbHours(){
	return numbHours;
    }
    public int computeWage(){
	return numbHours*rate;
    }
    public boolean equals(HourlyEmployee emp){
	if(fname.equals(emp.getFName())&& lname.equals(emp.getLName())){
	    if(EmployeeId  == emp.getEmployeeId()&& rate == emp.getRate() && numbHours == emp.getNumbHours()){
		return true;
	    }
	    else
		return false;
	}
	else 
	    return false;
    }
    public String toString(){
	String thing = "The employee "+ fname + " "+ lname + "\nEmployee ID: "+ EmployeeId +"\nWage: " + rate + "\nNumber of hours worked: "+ numbHours;
	return thing;
    }
}