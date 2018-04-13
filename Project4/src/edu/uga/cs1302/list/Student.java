package edu.uga.cs1302.list;

/**
 * @author Jamal Ballard
 *
 */
public class Student extends Person{
    private String collegeName;

    /**
     * 
     */
    public Student(){
	super();
	collegeName = "UGA";
    }
    /**
     * @param firstName
     * @param lastName
     * @param id
     * @param dob
     * @param collegeName
     */
    public Student(String firstName,String lastName,int id,String dob,String collegeName){
	super(firstName,lastName,id,dob);
	this.collegeName = collegeName;
    }
    /**
     * @return
     */
    public String  getCollegeName(){
	return collegeName;
    }
    /**
     * @param collegeName
     */
    public void setCollegeName(String collegeName){
	this.collegeName = collegeName;
    }
    
    /* (non-Javadoc)
     * @see edu.uga.cs1302.list.Person#toString()
     */
    public String toString(){
	String output;
	output = id+" "+firstName+" "+lastName+" "+dob+" ["+collegeName+"]";
	return output;
    }
}