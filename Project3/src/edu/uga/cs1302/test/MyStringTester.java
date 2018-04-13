package edu.uga.cs1302.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import edu.uga.cs1302.muttxt.*;

public class MyStringTester{
    /** Delcared variables for objects to be tested*/
    private MyString mystr1, mystr2, mystr3;
    
    @Before
    /** Create a setUp method to instantiate and 
     *initialize the objects*/
	public void setUp(){
        mystr1 = new MyString();
	mystr2 = new MyString('D');
	mystr3 = new MyString('A');
    }
    @After
    /** Create a tearDown methodto clean up after
     * each test case.*/
	public void tearDown(){
	mystr1 = null;
	mystr2 = null;
	mystr3 = null;
    }
    @Test
    /** Test Case 1: Append characters to object 
     * then test the length of the MyString*/
    public void testMyLength(){
	mystr1.setAt(0,'a');
	mystr1.setAt(1,'b');
	mystr1.setAt(2,'c');
	mystr1.setAt(3,'d');
	mystr1.setAt(4,'e');
	mystr1.setAt(5,'f');
	assertEquals(mystr1.myLength(),6); // the length should be 6
     }
    @Test
    /** Test Case 2: Initialize 2 MyString objects 
      then test if their char[] are equal*/
	public void testMyToCharArray(){
	mystr1.setAt(0,'a');
	mystr1.setAt(1,'b');
	mystr1.setAt(2,'c');
	mystr1.setAt(3,'d');
	mystr1.setAt(4,'e');
	mystr1.setAt(5,'f');
	// creates a MyString abcdef
	mystr2.setAt(0,'a');
	mystr2.setAt(1,'b');
	mystr2.setAt(2,'c');
	mystr2.setAt(3,'d');
	mystr2.setAt(4,'e');
	mystr2.setAt(5,'f');
	// creates a MyString abcdef
	assertArrayEquals(mystr1.myToCharArray(),mystr2.myToCharArray()); // they should be equal
    }
    @Test
    /** Test Case 3: Test the Instantiation of MyString objects*/
	public void testMyString(){
	assertEquals(mystr1.myLength(),0); // should be 0
	assertEquals(mystr2.myLength(),1); // should be 1
	assertTrue(mystr3.myCharAt(0) =='A'); // should be A
	
    }
    @Test
    /** Test Case 4: Initialize a MyString object 
	then test if the last char is what was set*/
	public void testSetAtAppend(){
	mystr1.setAt(0,'a');
	mystr1.setAt(1,'b');
	mystr1.setAt(2,'c');
	mystr1.setAt(3,'d');
	mystr1.setAt(4,'e');
	mystr1.setAt(5,'f');
	//creates a MyString abcedf
	assertTrue(mystr1.myCharAt(5) == 'f'); // should be f
    }
    @Test
    /** Test Case 5: Initialize a MyString object 
	then test if the changed char is what was set*/
	public void testSetAtReplace(){
	mystr1.setAt(0,'a');
	mystr1.setAt(1,'b');
	mystr1.setAt(2,'c');
	mystr1.setAt(3,'d');
	mystr1.setAt(4,'e');
	mystr1.setAt(2,'f');
	//creates a MyString abfdef
	assertTrue(mystr1.myCharAt(2) == 'f'); // should be f
    }
    @Test
    /** Test Case 6: Initialize a MyString object 
     then test if a botched append would throw the error.*/
	public void testSetAtAppendFail(){
	try{
	    mystr1.setAt(0,'a');
	    mystr1.setAt(1,'b');
	    mystr1.setAt(2,'c');
	    mystr1.setAt(3,'d');
	    mystr1.setAt(4,'e');
	    mystr1.setAt(6,'f');
	}
	catch(MyStringIndexOutOfBoundsException e){}
    }
    @Test
    /** Test Case 7: Test if two different MyStrings are equal */
	public void testEqualsDifferentType(){
	String string = "I'm a object";
	assertFalse(mystr2.equals(string));
	
    }
    @Test
    /** Test Case 8: Test if two equal MyStrings are equal*/
	public void testEqualsSameString(){
	mystr1.setAt(0,'D');
	assertTrue(mystr2.equals(mystr1));
    }
    @Test
    /** Test Case 9: Test if two different MyStrings are equal
      then change one to make it equal. Then test again.*/
	public void testEqualsDiffThenSame(){
	assertFalse(mystr2.equals(mystr1));
	mystr1.setAt(0,'D');
	assertTrue(mystr2.equals(mystr1));
    }
    @Test 
    /** Test Case 10: Test if myCharAt returns the appropriate char*/
	public void testMyCharAt(){
	mystr1.setAt(0,'a');
	mystr1.setAt(1,'b');
	mystr1.setAt(2,'c');
	assertTrue(mystr1.myCharAt(0)== 'a');
	assertTrue(mystr1.myCharAt(1)== 'b');
	assertTrue(mystr1.myCharAt(2)== 'c');
    }
    @Test
    /** Test Case 11: Initialize 3 MyString objects 
	then test mySubString*/ 
	public void testMySubString(){
	mystr1.setAt(0,'a');
	mystr1.setAt(1,'b');
	mystr1.setAt(2,'c');
	mystr1.setAt(3,'d');
	mystr1.setAt(4,'e');
	mystr1.setAt(5,'f');
	mystr2 = new MyString(mystr1.mySubString(3,6));
	assertEquals(mystr2.myLength(),3);
	mystr3.setAt(0,'d');
	mystr3.setAt(1,'e');
	mystr3.setAt(2,'f');
	assertEquals(mystr3.myLength(),3);
        assertTrue(mystr3.equals(mystr2));
    }
    @Test
    /** Test Case 12: Initialize 3 MyString objects 
     then test if the myConCat is working*/
	public void testMyConCat(){
	mystr1.setAt(0,'a');
	mystr1.setAt(1,'b');
	mystr1.setAt(2,'c');
	mystr2.setAt(0,'d');
	mystr2.setAt(1,'e');
	mystr2.setAt(2,'f');
        mystr3 = new MyString(mystr1.myConcat(mystr2));
	mystr1.setAt(0,'a');
	mystr1.setAt(1,'b');
	mystr1.setAt(2,'c');
	mystr1.setAt(3,'d');
	mystr1.setAt(4,'e');
	mystr1.setAt(5,'f');
	assertTrue(mystr3.equals(mystr1));
    }
   
}