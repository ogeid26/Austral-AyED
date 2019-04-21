package List;

public class GeneralList<T> implements Interfaces.GeneralList {

    private Node<T> start, window;

    public GeneralList(){
        start = new Node<>();
        window = new Node<>();
    }

    @Override
    public void remove() {

    }

    @Override
    public void goNext() {
        start.getNext();
    }

    @Override
    public void goPrev() {

    }

    @Override
    public void goTo(int n) {

    }

    @Override
    public Object getActual() {
        return null;
    }

    @Override
    public int getActualPosition() {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isVoid() {
        return false;
    }

    @Override
    public boolean endList() {
        return false;
    }

    @Override
    public Interfaces.GeneralList clone() {
        return null;
    }
}
