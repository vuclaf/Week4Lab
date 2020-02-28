import java.util.*;
/**
 * The iterator for the MyLinkedList class
 *
 * @author EvanVu
 */
public class MyLinkedListIterator<T> implements Iterator<T>
{
    private Node<T> current;
    private Node<T> previous;
    private Node<T> previous2;
    MyLinkedList<T> myList;
    
    /**
     * Constructor for the iterator
     * @param the list that the iterator iterates
     */
    public MyLinkedListIterator(MyLinkedList<T> myList){
        this.current=myList.get(0);
        this.myList=myList;
    }
    
    /**
     * Check if there is still an element in the list
     * @return true if there is still element in the list, false if not
     */
    public boolean hasNext(){
        if(current==myList.getTail()){
            return false;
        }
        return true;
    }
    
    /**
     * Return the current node and move on to the next node
     * @return the current node
     */
    public T next(){
        if (current==null) return null;
        if (current==myList.getTail()) return current.getValue();
        if (current.getNext()==myList.getTail()) previous2=previous;
        previous=current;
        current=current.getNext();
        return previous.getValue();
    }
    
    /**
     * Remove the current node
     */
    public void remove(){
        if(current.equals(myList.get(0))){
            myList.setHead(current.getNext());
            current=myList.get(0);
        }
        if(current.equals(myList.getTail())){
            myList.setTail(previous);
            current=myList.getTail();
            previous=previous2;
        }
        else{
            previous.setNext(current.getNext());
            current=null;
            current=previous;
        }
    }
}
