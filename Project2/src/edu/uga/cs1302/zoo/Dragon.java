package edu.uga.cs1302.zoo;
/**A representation of a mythical creature, the dragon. Dragons are (imaginary) Animals
 *and implement the Runner and Flyer interface
 */
public class Dragon extends Animal implements Runner,Flyer{
    /**
     *The constructor of the Dragon class
     *creates a Dragon and increments the number of animals
     *@see numOfLegs
     *@param age The age of the Dragon
     *@param name The name of the Dragon
     *@param numOfLegs The number of legs the dragon has
     */
    public Dragon(int age, String name, int numOfLegs){
	super(age,name,numOfLegs);
	numOfAnimals++;
    }
    /**
     *The defined method from the Runner interface
     *Prints that the animal is running
     *
     */
    public void run(){
	System.out.println(name + " is running");
    }
    /**
     *The defined method form the Flyer interface
     *Prints that the animal is flying
     *
     */
    public void fly(){
	System.out.println(name + " is flying");
    }
}