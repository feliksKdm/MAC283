package HW2Merge;

public class OrdArrayApp {
    public static void main(String[] args)
    {
        int maxSize = 30; // size of all arrays
        OrdArray arrS1, arrS2, arrD ; // arrays
        arrS1 = new OrdArray(maxSize); // source array 1
        arrS2 = new OrdArray(maxSize); // source array 2
        arrD = new OrdArray(maxSize); // destination array
        arrS1.insert(85); // put 10 items in S1
        arrS1.insert(20);
        arrS1.insert(0);
        arrS1.insert(47);
        arrS1.insert(25);
        arrS1.insert(24);
        arrS1.insert(4);
        arrS1.insert(20);
        arrS1.insert(87);
        arrS1.insert(61);
        arrS2.insert(7); // put 7 items in S2
        arrS2.insert(59);
        arrS2.insert(20);
        arrS2.insert(3);
        arrS2.insert(74);
        arrS2.insert(6);
        arrS2.insert(37);
        System.out.print("arrS1 = ");
        arrS1.display(); // display source 1
        System.out.print("arrS2 = ");
        arrS2.display(); // display source 2
        arrD.merge(arrS1, arrS2); // merge S1 and S2 to D
        System.out.print("arrD = ");
        arrD.display(); // display destination
    } // end main()
}
