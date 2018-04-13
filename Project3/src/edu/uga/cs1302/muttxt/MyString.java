package edu.uga.cs1302.muttxt;

import java.lang.IllegalArgumentException;
/**
 * An implementation of my own public string class
*/
public class MyString{
    
    private char[]charArray;
    /** The default size of a MyString object*/
    private final int DEFAULT_SIZE = 5;
    /** initializes a newly created MyString object that represents an empty charcter sequence*/
    public MyString(){
	charArray = new char[DEFAULT_SIZE];
    }
    /** initializes a newly created MyString object that represents just a character ch
     *@param ch The character that will be in the MyString
     */
    public MyString(char ch){
	charArray = new char[DEFAULT_SIZE];
	charArray[0] = ch;
    }
    /** initializes a newly created MyString object with capacity size
     *@param size The size of the initial carArray
     */
    public MyString(int size){
	charArray = new char[size];
    }
    /**  initializes a newly created MyString object representing the same string as as otherMyString
     *@param otherMyString the MyString that you want to copy
     */
    public MyString(MyString otherMyString)throws IllegalArgumentException{
	if(otherMyString == null){
	    throw new IllegalArgumentException();
	}
	charArray = new char[otherMyString.myLength()];
	for(int i = 0; i < charArray.length; i++){
	    charArray[i] = otherMyString.myCharAt(i);
	}
	
    }
    /** compares two objects for equality
     *@param o An object
     *@return if the objects are equals
     */
    public boolean equals(Object o){
	if(o != null && o instanceof MyString ){
	    MyString myString = (MyString) o;
	    if(myString.myLength() == this.myLength()){
		for(int i = 0; i < myLength();i++){
		    if(charArray[i] != myString.myCharAt(i)){
			return false;
		    }
		}
		return true;
	    }
	    else
		return false;
	}
	else 
	    return false;
    } // equals
    /**
     * returns the char at location index
     * throws MyStringIndexOutOfBoundsException
     *@param index The index that we check
     *@return char at that index
     */
    public char myCharAt(int index) throws MyStringIndexOutOfBoundsException{
	if(index < 0 || index >= myLength() ){
	    throw new MyStringIndexOutOfBoundsException(index);
	}
	return charArray[index];
    }// myCharAt
    /** Concatenation of two MyString objects
     *  throws IllegalArgumentException
     *@return the combined MyString object
     *@param otherMyString The other MyString object you want to concatenate
     */
    public MyString myConcat(MyString otherMyString)throws IllegalArgumentException{
	if(otherMyString == null){ 
	    throw new IllegalArgumentException();
	}
	if(otherMyString.myLength() == 0){
	    return this;
	}
	MyString conCatString = new MyString(myLength() + otherMyString.myLength());
	for(int i = 0; i < myLength();i++){ 
	    conCatString.setAt(i,charArray[i]); // add character from this MyString to conCatString 
	}
	for(int i = myLength(), j = 0; i < myLength()+otherMyString.myLength();i++,j++){
	    conCatString.setAt(i,otherMyString.myCharAt(j)); // add charcter from otherMyString to conCatString
	}
	return conCatString;
    }// myConcat
    /**Prints out the characters in the MyString object*/
    public void myLineDisplay(){
	for(int i = 0; i < myLength();i++){
	    System.out.print(charArray[i]);
	}
	System.out.println();
    }// myLineDisplay
    /** Returns the first index of ch or -1
     *@param ch The character you are searching for
     *@return int the index of the char or -1
     */
    public int myIndexOf(char ch){	
	for(int i = 0; i < myLength();i++){
	    if(charArray[i] == '\u0000') // if char == null
		break;
	    if(charArray[i] == ch){ // if char == ch
		return i;
	    }
	}
	return -1;
    }// myIndexOf
    /** Returns the number of chars/ the length of the MyString object
     *@return int The length of MyString
     */
    public int myLength(){
	int count = 0;
	for(int i = 0; i < charArray.length;i++){
	    if(charArray[i] != '\u0000'){ // if char != null
		count++;
	    }
	    else
		break;
	}
	return count;
    }// myLength
    /** Sets the char at index to ch or appends that char to the end
     * throws MyStringIndexOutOfBoundsException
     *@param index The index that you access
     *@param ch The char that you replace/append
     */
    public void setAt(int index, char ch) throws MyStringIndexOutOfBoundsException{
	if (index < myLength() && index > -1){ // if the index is >=0 & less than the length
	    charArray[index] = ch;
	}
	else if(index == myLength()){ // if the index is equal to the length then append
	    
	    char[] charArrayCopy = new char[myLength()]; // copy old content
	    for(int i = 0; i < myLength();i++){
		charArrayCopy[i] = charArray[i];
	    }
	    charArray = new char[charArray.length*2]; // double charArray capacity
	    for(int i = 0; i < charArrayCopy.length;i++){ // rewrite
		charArray[i] = charArrayCopy[i];
	    }
	    charArray[index] = ch; // append
	}
	else
	    throw new MyStringIndexOutOfBoundsException(index);
    }
    /**Returns a new Mystring representing the substring 
     * of this string from low up through high-1
     *@param low The lower bound of the substring
     *@param high The upper bound of the substring. It is not included in the new substring
     *@return MyString The substring of MyString
     */
    public MyString mySubString(int low, int high)throws MyStringIndexOutOfBoundsException{
	if(high < low){
	    throw new MyStringIndexOutOfBoundsException("highIndex = " + high + " less than lowIndex = " + low);
	}
	if(low == high){
	    MyString emptyString = new MyString();
	    return emptyString;
	}
	MyString mySubString = new MyString(high - low);
	for(int i = 0, j = low; i < (high - low);i++,j++){
	    mySubString.setAt(i,charArray[j]); 
	}
	return mySubString;
    }// mySubstring
    /**Returns MyString converted to a character array
     *@return char[] The MyString in char[] form*/
    public char[] myToCharArray(){
	char[] myStringToChar = new char[ myLength()];
	for(int i = 0; i < myStringToChar.length;i++){
	    myStringToChar[i] = charArray[i];
	}
	return myStringToChar;
    }// myToCharArray
}