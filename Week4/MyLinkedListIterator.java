import java.util.*;
/**
 * Write a description of class MyLinkedListIterator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyLinkedListIterator<T> implements Iterator<T>
{
    private Node<T> current;
    private Node<T> previous;
    private Node<T> previous2;
    MyLinkedList<T> myList;
    
    public MyLinkedListIterator(MyLinkedList<T> myList){
        this.current=myList.get(0);
        this.myList=myList;
    }
    
    public boolean hasNext(){
        if(current==myList.getTail()){
            return false;
        }
        return true;
    }
    
    public T next(){
        if (current==null) return null;
        if (current==myList.getTail()) return current.getValue();
        previous=current;
        current=current.getNext();
        return previous.getValue();
    }
    
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
