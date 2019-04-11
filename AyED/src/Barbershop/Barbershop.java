package Barbershop;
import Queue.DynamicQueue;

public class Barbershop {

    DynamicQueue<Client> q = new DynamicQueue<Client>(20);
    Barber[] barbers;

    public Barbershop(int barberAmount ){
        barbers = new Barber[barberAmount];
    }
    public void enque(Client c){
        q.enqueue(c);
    }

    public void attend(){

        for (Barber b : barbers){
            if (b.isFree()) {
                b.attend( q.dequeue());
            }

            else if (!b.isFree() ){

            }
        }

    }


}
