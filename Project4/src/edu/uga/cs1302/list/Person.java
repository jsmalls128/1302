package edu.uga.cs1302.list;

/**
 * @author Jamal Ballard
 *
 */
public class Person implements Comparable<Person>{
    protected String firstName;
    protected String lastName;
    protected int id;
    protected String dob;
 
    /**
     * 
     */
    public Person(){
	this.firstName = "Joe";
	this.lastName = "Smith";
	this.id = 1111;
	this.dob = "01-25-1990";
    }
    /**
     * @param firstName
     * @param lastName
     * @param id
     * @param dob
     */
    public Person(String firstName,String lastName,int id,String dob){
	this.firstName = firstName;
	this.lastName = lastName;
	this.id = id;
	this.dob = dob;
    }
    /**
     * @return
     */
    public String getFirstName(){
	return firstName;
    }
    /**
     * @param firstName
     */
    public void setFirstName(String firstName){
	this.firstName = firstName;
    }
    /**
     * @return
     */
    public String getLastName(){
	return lastName;
    }
    /**
     * @param lastName
     */
    public void setLastName(String lastName){
	this.lastName =  lastName;
    }
    /**
     * @return
     */
    public int getID(){
	return id;
    }
    /**
     * @param id
     */
    public void setID(int id){
	this.id = id;
    }
    /**
     * @return
     */
    public String getDOB(){
	return dob;
    }
    /**
     * @param dob
     */
    public void setDOB(String dob){
	this.dob = dob;
    }
    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Person o){
	if(o instanceof Person){
	    if(id > o.getID())
		return 1;
	    if(id < o.getID())
		return -1;
	    return 0;
	}
	return -1;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object o){
	if(o instanceof Person){
	    if(compareTo((Person) o) == 0)
		return true;
	    return false;
	}
	return false;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
	String output;
	output = id + " "+firstName+" "+lastName+" "+dob;
	return output;
    }

    
}