package edu.uga.cs1302.zoo;
/**A representation of a cat. Cats are Animals and implement the Runner interface.*/
public class Cat extends Animal implements Runner{
    /**
     *The Constructor of the Cat class
     *Creates a Cat and increments the number of animals 
     *@see numOfLegs
     *@param age The age of the Cat
     *@param name The name of the Cat
     *@param numOfLegs The number of legs that the Cat has
     */
    public Cat(int age, String name, int numOfLegs){
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

