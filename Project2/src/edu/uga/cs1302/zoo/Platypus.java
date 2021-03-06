package edu.uga.cs1302.zoo;
/**A representation of a Platypus. Platypi are Animals and implement the Runner interface*/
public class Platypus extends Animal implements Runner{
    /**
     *The contructor of the Platypus class
     *Creates a Platypus and increments the number of animals
     *@see numOfAnimals
     *@param age The age of the Platypus
     *@param name The name of the Platypus
     *@param numOfLegs The number of legs that the Platypus has
     */
    public Platypus(int age, String name, int numOfLegs){
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
}