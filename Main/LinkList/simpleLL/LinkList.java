package LinkList.simpleLL;

class LinkList {
    private Link first;            // ref to first link on list
    //-------------------------------------------------------------
    public LinkList()              // constructor
    {
        first = null;               // no links on list yet
    }
    //-------------------------------------------------------------
    public void insertFirst(int id)
    {                           // make new link
        Link newLink = new Link(id);
        newLink.next = first;       // it points to old first link
        first = newLink;            // now first points to this
    }
    //-------------------------------------------------------------
    public Link find(int key)      // find link with given key
    {                           // (assumes non-empty list)
        Link current = first;              // start at 'first'
        while(current.iData != key)        // while no match,
        {
            if(current.next == null)        // if end of list,
                return null;                 // didn't find it
            else                            // not end of list,
                current = current.next;      // go to next link
        }
        return current;                    // found it
    }
    //-------------------------------------------------------------
    public Link delete(int key)    // delete link with given key
    {                           // (assumes non-empty list)
        Link current = first;              // search for link
        Link previous = first;
        while(current.iData != key)
        {
            if(current.next == null)
                return null;                 // didn't find it
            else
            {
                previous = current;          // go to next link
                current = current.next;
            }
        }                               // found it
        if(current == first)               // if first link,
            first = first.next;             //    change first
        else                               // otherwise,
            previous.next = current.next;   //    bypass it
        return current;
    }

    public Boolean isEmpty(){
        return first == null;
    }

    public Link deleteFirst(){
        if(this.isEmpty()){
            return null;
        }
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void insertLast(int id){
        Link newLink = new Link(id);
        if(this.isEmpty()){
            this.insertFirst(id);
        }else{
            Link current = first;       // start at beginning of list
            while(current.next != null)      // until end of list,
            {
                current = current.next;  // move to next link
            }      // it points to old first link
            current.next = newLink;

        }
    }

    public int size() {
        int count = 0;
        Link current = first;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    //-------------------------------------------------------------

    public Link deleteLast(){
        if(this.isEmpty()){
            return null;
        }

        if (first.next == null){
            Link temp = first;
            first = null;
            return temp;
        }

        Link current = first;
        Link previous = null;

        while (current.next != null){
            previous = current;
            current = current.next;
        }

        previous.next = null;
        return previous;
    }

    public void displayList()      // display the list
    {
        System.out.print("List (first-->last): ");
        Link current = first;       // start at beginning of list
        while(current != null)      // until end of list,
        {
            current.displayLink();   // print data
            current = current.next;  // move to next link
        }

    }
    //-------------------------------------------------------------

}  // end class LinkList
