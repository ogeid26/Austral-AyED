package Queue;

public class DynamicQueue<T> {

    private Node<T> front, back;
    private int amount, size;

    public DynamicQueue(int size){
        this.size = size;
        this.amount = 0;
        front = null;
        back = null;
    }

    public DynamicQueue(){
        this.size = 1000000;
        this.amount = 0;
        front = null;
        back = null;
    }

    public void enqueue(T t) {
        Node newNode = new Node();
        newNode.data = t;
        newNode.next = null;
        if (amount < size){
            if (isEmpty()){
                front = newNode;
                back = newNode;
            }
            else{
                back.next = newNode;
                back = newNode;
            }
            amount++;
        }
        else{
            throw new IllegalStateException("Queue is already full.");
        }
    }

    public T dequeue() {
        if (!isEmpty()){
            T data = front.data;
            if (front == back){
                front = null;
                back = null;
            }
            else{
                front = front.next;
            }
            amount--;
            return data;
        }
        else{
            throw new RuntimeException("Cannot remove elements from empty queue.");
        }
    }
    public boolean isEmpty() {
        return amount == 0;
    }

    public int length() {
        return amount;
    }

    public int size() {
        return size;
    }

    public void empty() {
        front = null;
        back = null;
        amount = 0;
    }



}
