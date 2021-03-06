package edu.uga.cs1302.zoo;
/**
  * A representation of an Animal. These animals all have an age, name, and certain number of legs.
  * The amount of Animals created is also stored.
  */
public abstract class Animal implements Nameable {

    /** The age of an Animal*/
    protected int age;
    /** The name of the Animal*/
    protected String name;
    /** The number of legs an Animal has*/
    protected int numOfLegs;
    /** numOfAnimals is static because we want it tied to the class rather than a single object*/
    protected static int numOfAnimals = 0;
    /**
     *Creates a representation of an Animal that has an age, name, and number of legs
     *@param age the age of the animal
     *@param name the name of the animal
     *@param numOfLegs the number of legs the animal has
     */
    public Animal(int age, String name, int numOfLegs){
	this.age = age;
	this.name = name;
	this.numOfLegs = numOfLegs;
    }
    /**
     *Returns the name of an animal
     *@return String This returns the name 
     */
    public String getName(){
	return name;
    }
    /**
     *Sets the name of an Animal 
     *@param name the name that you want to set
     *
     */
    public void setName(String name){
	this.name = name;
    }
    /**
     *Returns the age of an Animal
     *@return int this returns the age
     */
    public int getAge(){
	return age;
    }
    /**
     *Sets the age of an Animal
     *@param age the new age of the Animal
     *
     */
    public void setAge(int age){
	this.age = age;
    }
    /**
     *Returns the number of legs an Animal has
     *@return int this returns the number of legs
     */
    public int getNumOfLegs(){
	return numOfLegs;
    }
    /**
     *Sets the number of legs an Animal has
     *@param numOfLegs the number of legs an Animal has
     *
     */
    public void setNumOfLegs(int numOfLegs){
	this.numOfLegs = numOfLegs;
    }
    /**
     *Returns the number of Animal instances
     *@return int this returns the number of animals
     */
    public static int getNumOfAnimals(){
	return numOfAnimals;
    }

}