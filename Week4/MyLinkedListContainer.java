
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
    
        return -1;
    }
    
    public int searchWOIterator(T value){
    
        return -1;
    }
}
