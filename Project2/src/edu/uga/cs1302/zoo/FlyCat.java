package edu.uga.cs1302.zoo;
/**A representation of a Flying Cat. FlyCats are imaginary Animals and implement the Flyer interface*/
public class FlyCat extends Animal implements Flyer{
    /**The Constructor of the FlyCat class
     * Creates a FlyCat and increments the number of animals
     *@see numOfLegs
     *@param age The age of the FlyCat
     *@param name The name of the FlyCat
     *@param numOfLegs the number of legs that the FlyCat has
     */
    public FlyCat(int age, String name, int numOfLegs){
	super(age,name,numOfLegs);
	numOfAnimals++;
    }
    /**
     *The defined method form the Flyer interface
     *Prints that the animal is flying
     *
     */
    public void fly(){
	System.out.println(name +" is flying");
    } 
}