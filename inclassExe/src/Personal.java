public abstract class Personal
{    
    protected String fname;
    protected String lname;
    
    Personal(String fname, String lname){
	this.fname = fname;
	this.lname = lname;
    }
    public String getFName(){
	return fname;
    }
    public String getLName(){
	return lname;
    }
    public abstract int computeWage();{

    }
    
}