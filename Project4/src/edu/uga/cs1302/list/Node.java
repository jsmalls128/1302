package edu.uga.cs1302.list;

/** Node class is the blocks that the sorted list links together */
public class Node<T>{

    private T data;
    private Node<T> next;
    private Node<T> prev;
    
    /**
     * 
     */
    public Node(){
	next = null;
	prev = null;
	data = null;	
    }
    /**
     * @param data
     * @param next
     * @param prev
     */
    public Node(T data, Node next, Node prev){
	this.data = data;
	this.next = next;
	this.prev = prev;
	 
    }
    /**@return Node The next Node*/
    public Node getNext(){
	return next;
    }
    /**@return Node The previous Node*/
    public Node getPrev(){
	return prev;
    }
    /**@return T */
    public T getData(){
	return data;
    }
    /**
     * @param next
     */
    public void  setNext(Node next){
	this.next = next;
    }
    /**
     * @param prev
     */
    public void setPrev(Node prev){
	this.prev = prev;
    }
    /**
     * @param data
     */
    public void setData(T data){
	this.data = data;
    }
    
}