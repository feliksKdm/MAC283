package LinkList.simpleLL;

class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();  // make list

        theList.insertFirst(22);      // insert 4 items
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);

        theList.displayList();              // display list
        System.out.println("\nSize: " + theList.size());

        Link f = theList.find(44);          // find item
        if( f != null)
            System.out.println("Found link with key " + f.iData);
        else
            System.out.println("Can't find link");

        Link d = theList.delete(66);        // delete item
        if( d != null )
            System.out.println("Deleted link with key " + d.iData);
        else
            System.out.println("Can't delete link");

        theList.displayList();              // display list
        System.out.println("\nSize: " + theList.size());

        System.out.println("");
        System.out.println(theList.isEmpty());

        theList.deleteFirst();
        theList.displayList();
        System.out.println("\nSize: " + theList.size());

        theList.insertLast(10);
        theList.displayList();
        System.out.println("\nSize: " + theList.size());

        Link q = theList.deleteLast();
        if (q != null) {
            System.out.println("Deleted last link with key " + q.iData);
        }
        theList.displayList();
        System.out.println("\nSize: " + theList.size());
    }  // end main()

    // to do "delete last at home" "size of Link list"
}  // end class LinkListApp
