
/**
 * Write a description of class MyLinkedListContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyLinkedListContainer<T>
{
    // instance variables - replace the example below with your own
    private MyLinkedList<T> myList;

    /**
     * Constructor for objects of class MyLinkedListContainer
     */
    public MyLinkedListContainer()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
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
