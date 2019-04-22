package Barbershop;

public class Barber {

    private boolean isFree;
    private Client client;
    private double time;

    public boolean isFree() {
        return isFree;
    }

    public void attend(Client c){
        isFree = false;
        this.client = c;
        this.time = Math.random()*10 + 10;
    }


}
