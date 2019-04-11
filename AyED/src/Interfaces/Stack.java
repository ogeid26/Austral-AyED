package Interfaces;

public interface Stack<T> {
    void push(T t);
    void pop();
    T peek();
    boolean isEmpty();
    int size();
    void empty();
}