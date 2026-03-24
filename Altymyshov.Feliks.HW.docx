package HW2Merge;

import java.util.Arrays;

public class OrdArray
{
    private long[] a; // ref to array a
    private int nElems; // number of data items
    //--------------------------------------------------------------
    public OrdArray(int max) // constructor
    {
        a = new long[max]; // create array
        nElems = 0;
    }
    //--------------------------------------------------------------
    public void insert(long value) // put element into array
    {
        int j;
        for(j=0; j<nElems; j++) // find where it goes
            if(a[j] > value) // (linear search)
                break;
        for(int k=nElems; k>j; k--) // move bigger ones up
            a[k] = a[k-1];
        a[j] = value; // insert it
        nElems++; // increment size
    } // end insert()
    //--------------------------------------------------------------
    public void display() // displays array
    {
        for(int j=0; j<nElems; j++) // for each element,
            System.out.print(a[j] + " "); // display it
        System.out.println("");
    }
    //--------------------------------------------------------------
    public void merge(OrdArray x, OrdArray y){
        int q = 0;
        int w = 0;
        int t = 0;

        while (q < x.nElems && w < y.nElems){
            if(x.a[q] < y.a[w]){
                a[t] = x.a[q];
                q++;
            }
            else{
                a[t] = y.a[w];
                w++;
            }
            t++;
        }

        while (q < x.nElems ){
            a[t] = x.a[q];
            q++;
            t++;
        }

        while (w < y.nElems ){
            a[t] = y.a[w];
            w++;
            t++;
        }
        //------------------------------------------------------------
        nElems = x.nElems + y.nElems;
    }
//--------------------------------------------------------------
}
