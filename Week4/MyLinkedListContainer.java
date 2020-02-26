import java.util.*;
/**
 * Contains instances of MyLinkedList and call add/search methods
 *
 * @author EvanVu
 * @version 1.0
 */
public class MyLinkedListContainer<T>
{
    private MyLinkedList<T> myList;

    /**
     * Constructor for a new MyLinkedListContainer
     */
    public MyLinkedListContainer()
    {
    }

    /**
     * Add a new Node with a value to the front of a Linked list
     *
     * @param  The value (of type T that) needs to be added
     */
    public void addToFront(T value)
    {
        myList.addFirst(value);
    }
    
    public void addToBack(T value){
        myList.addEnd(value);
    }
    
    public int searchWithIterator(T value){
        Iterator iterator = new MyLinkedListIterator(myList);
        int i=0;
        while(iterator.hasNext()){
            if(iterator.next()==value) return i;
            i++;
        }
        return -1;
    }
    
    public int searchWOIterator(T value){
        int i=0;
        while (myList.get(i)!=myList.getTail()){
           if (myList.get(i).getValue()==value) return i;
           i++;
        }
        return -1;
    }
}
