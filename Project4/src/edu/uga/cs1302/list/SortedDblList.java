package edu.uga.cs1302.list;
import java.io.*;
import java.lang.IndexOutOfBoundsException;
import java.io.*;

/**
 * @author Jamal Ballard
 *
 * @param <T>
 */
public class SortedDblList<T extends Comparable<? super T>> implements Serializable {
    private int size;
    private Node head =  null;
    private Node tail = null;
    
    /**
     * 
     */
    public SortedDblList(){
	head = null;
	tail = null;
	size = 0;
    }
    /**
     * @param fileName
     * @throws IOException
     */
    public void saveListObjects(String fileName) throws IOException{
	FileOutputStream out = new FileOutputStream(fileName);
	ObjectOutputStream oout = new ObjectOutputStream(out);	
	Node currentNode = head;
	oout.writeObject(size);
	for (int i = 0; i < size; i++){
	    oout.writeObject((T)currentNode.getData());
	    currentNode = currentNode.getNext();
	}
	oout.close();
    }
    /**
     * @param fileName
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void loadListObjects(String fileName) throws IOException, ClassNotFoundException{
	FileInputStream is = new FileInputStream(fileName);
	ObjectInputStream ois = new ObjectInputStream(is);
        int count = (Integer)ois.readObject();
        for(int i = 0; i < count; i++){
	    this.add((T)ois.readObject());
        }
    }	
    /**
     * @return
     */
    public int getSize(){
	return size;
    }
    @SuppressWarnings("unchecked")
	public T get(int index) throws IndexOutOfBoundsException{
	Node<T> currentNode = head;
	if(index < 0 || index >= size)
	    throw new IndexOutOfBoundsException();
	else{
	    if(index == 0)
		return currentNode.getData();
	    for(int i = 0; i < index;i++){
		currentNode = currentNode.getNext();
	    }
	    return currentNode.getData();
	}	
    }
    /**
     * @return
     */
    public boolean isEmpty(){
	if(head == null)
	    return true;
	return false;
    }
    /**
     * @param element
     * @return
     */
    public boolean add(T element){	
	Node<T> addedNode = new Node<T>(element,null,null);
	if(addedNode.getData() == null)
	    return false;
	if (head == null){   
	    head = addedNode;
	    tail = head;
	    size++;
	    return true;
	}
	Node<T> currentNode = head;
	if(currentNode.getData().compareTo(addedNode.getData())>0){
			head = addedNode;
			currentNode.setPrev(addedNode);
			addedNode.setNext(currentNode);
			size++;
			return true;
		}	
	while(true){
	    if(currentNode == null){
		tail.setNext(addedNode);
		addedNode.setPrev(tail);
		tail = addedNode;
		size++;
		return true;
	    }
	    if(currentNode.getData().compareTo(addedNode.getData())<0){
		currentNode = currentNode.getNext();
		continue;
	    }
	    if(currentNode.getData().compareTo(addedNode.getData())==0){
		return false;
	    }
	    break;
	}
	
	addedNode.setPrev(currentNode.getPrev());
	currentNode.getPrev().setNext(addedNode);
	addedNode.setNext(currentNode);
	currentNode.setPrev(addedNode);
	size ++;
	return true;
    }
    /**
     * @param o
     * @return
     */
    public boolean remove(Object o){
	Node<T> currentNode = head;
	if (currentNode == null)
	    return false;
	if (currentNode.getData().equals(o)){
	    head = currentNode.getNext();
	    //currentNode.setNext(null);
	    //currentNode.setData(null);
	    size--;
	    return true;
	}
	for(int i = 0; i < size; i++){
	    if(get(i).equals(o)){
		for(int j = 0; j < i; j++){
		    currentNode = currentNode.getNext();
		}
		currentNode.getPrev().setNext(currentNode.getNext());
		if(currentNode.getNext() != null)
		    currentNode.getNext().setPrev(currentNode.getPrev());
		else
		    tail = currentNode.getPrev();
		currentNode.setNext(null);
		currentNode.setPrev(null);
		currentNode.setData(null);
		size--;
		return true;
	    }
	}
	return false;
    }
    /**
     * 
     */
    public void printList(){
	Node<T> currentNode = head;
	for (int i =0; i < size; i++){
	    System.out.println(currentNode.getData().toString());
	    currentNode = currentNode.getNext();
	}
    }
    public int indexOf(Object o){
	Node<T> currentNode = head;
	if (currentNode == null)
	    return -1;
	for(int i = 0; i < size; i++){
	    if(get(i).equals(o)){
		return i;
	    }
	}
	return -1;
    }
    /**
     * @param otherList
     * @return
     */
    public SortedDblList<T> union(SortedDblList<? extends T> otherList){
	SortedDblList<T> union = new SortedDblList<T>();
	for(int i = 0; i < size; i++){
	    union.add(get(i));
	}
	for(int j = 0; j < otherList.getSize(); j++){
	    union.add(otherList.get(j));
	}
	return union;
    }
    /**
     * @param otherList
     * @return
     */
    public SortedDblList<T> intersection(SortedDblList<? extends T> otherList){
	SortedDblList<T> intersection = new SortedDblList<T>();
	T temp;
	for(int i = 0; i < otherList.getSize(); i++){
	    temp = otherList.get(i);
	    if(add(temp)){
		remove(temp);
	    }
	    else{
		intersection.add(otherList.get(i));
	    }
	}
	return intersection;
    }
}