package TP_Colas;

import Queue.StaticQueue;

public class StaticPriorityQueue<T> {
    // An array that contains queue, in which the first element of the array has the maximum priority, and the last one the least, naturally.

    private StaticQueue[] priorityQueue;

    // Constructor
    public StaticPriorityQueue(int size) {
        priorityQueue = new StaticQueue[size];
        for (int i = 0; i < priorityQueue.length; i++){
            priorityQueue[i] = new StaticQueue(1);
        }
    }


    public  void enqueue(T elem, int lane){
        if (lane <= 0)
            throw new IllegalArgumentException();
        else if (lane > )
    }

    public void dequeue(){
        priorityQueue[0].dequeue();
    }

    public StaticQueue[] getQueue(){return priorityQueue;}

}
