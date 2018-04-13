public class ArrayStack implements StackADT<T>{
    
    private T[] st;
    private int top;

    public ArrayStack(int capacity){
	st = (T[]) new Object[capacity];
	top = 0;
    }
    public void push(T element){
	if(top ==st.length){
	    expandStack();
	}
	st[top] = element;
	top++;
    }
}