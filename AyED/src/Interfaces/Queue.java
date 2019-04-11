package Interfaces;

public interface Queue<Q> {
    void enqueue(Q q);
    Q dequeue();
    boolean isEmpty();
    int length();
    int size();
    void empty();

}