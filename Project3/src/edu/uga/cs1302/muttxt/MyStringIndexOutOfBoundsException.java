package edu.uga.cs1302.muttxt;

/**Our own error class for when our MyString objects' index is accesed out of bounds*/
public class MyStringIndexOutOfBoundsException extends IndexOutOfBoundsException{
    /**Constructs a MyStringIndexOutOfBoundsException
     * calls the default constructor of its superclass
     */
    public MyStringIndexOutOfBoundsException(){
	super();
    }
    /**Constructs a MyStringIndexOutOfBoundsException
     * calls the 1 string parameter constructor of its superclass
     * @param errMsg The error message that will be displayed
     */
    public MyStringIndexOutOfBoundsException(String errMsg){
	super(errMsg);
    }
    /**Constructs a MyStringIndexOutOfBoundsException
     * calls the 1 string parameter constructor of its superclass
     * @param index The index that was attempted to be accesed
     */
    public MyStringIndexOutOfBoundsException(int index){
	super("MyString index out of range: " + index);
    }
}