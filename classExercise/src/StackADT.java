public interface StackADT<T>{
    public void push(T element);
    public T pop();
    public T peek();
    public beelean isEmpty();
    public int size();
    public String toString();
}