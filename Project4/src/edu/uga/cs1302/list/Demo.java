package edu.uga.cs1302.list;

import java.io.IOException;

/**
 * @author Jamal Ballard
 *
 */
public class Demo{
    
    public static void main(String args[]){
	Person p1 = new Person("John","Snow", 1234, "07-07-1991");
	Person p2 = new Person("Joe","Sno", 5234, "06-06-1990");
	Person p3 = new Person("John","Snow", 2234, "08-68-1998");
	SortedDblList<Person> person =  new SortedDblList<Person>();
	if(person.isEmpty())
	    System.out.println("The list is empty");
	person.add(p1);
	//person.add(p2);
	//person.add(p3);
	if(!person.isEmpty())
	    System.out.println("The list is not empty");
	person.printList();
	System.out.println(person.indexOf(p2));
	System.out.println(person.get(0));
	person.remove(p1);
	
	Person p4 = new Person("John","Snow", 1234, "07-07-1991");
	Person p5 = new Person("Joe","Sno", 3005, "06-06-1990");
	Person p6 = new Person("John","Snow", 2254, "08-68-1998");
	SortedDblList<Person> person2 =  new SortedDblList<Person>();

	person2.add(p4);
	person2.add(p5);
	person2.add(p6);
	SortedDblList<Person> person3 = person.union(person2);
	SortedDblList<Person> person4 = person.intersection(person3);
	person3.printList();
	person4.printList();
	SortedDblList<Person> personLoad =  new SortedDblList<Person>();
	String file = "Test.txt";
	try {
		person4.saveListObjects(file);
		personLoad.loadListObjects(file);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	personLoad.printList();
	
    }
}