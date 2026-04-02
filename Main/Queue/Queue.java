package Queue;

import java.util.Arrays;

class Queue
{
    private final int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;
    //--------------------------------------------------------------
    public Queue(int s) // constructor
    {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    //--------------------------------------------------------------
    public void insert(long j) // put item at rear of queue
    {
        if(rear == maxSize-1) // deal with wraparound
            rear = -1;
        queArray[++rear] = j; // increment rear and insert
        nItems++; // one more item
    }
    //--------------------------------------------------------------
    public long remove() // take item from front of queue
    {
        long temp = queArray[front++]; // get value and incr front
        if(front == maxSize) // deal with wraparound
            front = 0;
        nItems--; // one less item
        return temp;
    }
    //--------------------------------------------------------------
    public long peekFront() // peek at front of queue
    { return queArray[front]; }
    //--------------------------------------------------------------
    public boolean isEmpty() // true if queue is empty
    { return (nItems==0); }
    //--------------------------------------------------------------
    public boolean isFull() // true if queue is full
    { return (nItems==maxSize); }
//--------------------------------------------------------------
    public void display(){
        System.out.println("Array: " + Arrays.toString(queArray).replace(",","").replace("[","").replace("]",""));

        System.out.printf("Queue: ");

        for(int i=0; i<nItems; i++){
            int index = front + i;
            System.out.print(queArray[index] + " ");
        }
        System.out.println();
    }
} // end class Queue
