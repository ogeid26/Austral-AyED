package Queue;

public class StaticQueue<T> {

    private T[] array;
    private int front, back, size, amount;

    public StaticQueue(int size){
        this.size = size;
        front = 0;
        back = 0;
        amount = 0;
        array = (T[]) new Object[size];
    }

    public void enqueue(T t){
        increment();
        amount++;
        array[back-1] = t;
    }

    public T dequeue(){
        T element = array[front];
        front++;
        amount--;
        return element;
    }

    public boolean isEmpty(){
        return (amount != size);
    }

    public int length(){
        return amount;
    }

    public int size(){
        return size;
    }

    public void empty(){
        front = 0;
        back = 0;
        amount = 0;
    }

    private void increment(){
            if (back != size)
                back++;
            else if
                (amount < size)
                    back = 0;
            else
                throw new IllegalArgumentException("Queue is full.");
        }
}
