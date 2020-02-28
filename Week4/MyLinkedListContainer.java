import java.util.*;
/**
 * Contains instances of MyLinkedList and call add/search methods
 *
 * @author EvanVu
 * @version 1.0
 */
public class MyLinkedListContainer<T>
{
    private MyLinkedList<T> myList = new MyLinkedList<T>();

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
    
    /**
     * Add a new Node with a value to the back of a Linked list
     *
     * @param  The value (of type T that) needs to be added
     */
    public void addToBack(T value){
        myList.addEnd(value);
    }
    
    /**
     * Search the list for a wanted value using an iterator
     *
     * @param  The value (of type T that) needs to be found
     */
    public int searchWithIterator(T value){
        Iterator<T> iterator = new MyLinkedListIterator<T>(myList);
        int i=0;
        while(iterator.hasNext()){
            if(iterator.next()==value) return i;
            i++;
        }
        return -1;
    }
    
    /**
     * Search the list for a wanted value not using an iterator
     *
     * @param  The value (of type T that) needs to be found
     */
    public int searchWOIterator(T value){
        int i=0;
        while (myList.get(i)!=myList.getTail()){
           if (myList.get(i).getValue()==value) return i;
           i++;
        }
        return -1;
    }
}
