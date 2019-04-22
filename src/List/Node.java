package List;

public class Node<T> {

    private T info;
    private Node next;

    public Node getNext() { return next; }

    public T getInfo() {return info; }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
