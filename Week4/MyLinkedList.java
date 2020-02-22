import java.util.*;
/**
 * A singly linked, non-circular list with linked nodes.
 * Each list has a head and tail node.
 *
 * @author Evan Vu
 * @version 1.0
 */
public class MyLinkedList<T> implements Iterable<T>
{   
    private Node<T> head;
    private Node<T> tail;
    
    /**
     * Constructor for objects of class MyLinkedList.
     */
    public MyLinkedList()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Iterator<T> iterator()
    {
        return new MyLinkedListIterator(this);
    }
    
    public void addFirst(T value){
        if (this.head==null){
            Node<T> newHead = new Node(value, null);
            this.head=newHead;
        }
        else{
            Node<T> newHead = new Node(value,this.head);
            this.head=newHead;
        }
    }
    
    public void addEnd(T value){
        if (this.head==null){
            Node<T> newHead = new Node(value, null);
            this.head=newHead;
        }
        else if (this.tail==null) {
            Node<T> newTail = new Node(value,null);
            this.tail=newTail;
            this.head.setNext(tail);
        }
        else{
            Node<T> newTail = new Node(value,null);
            tail.setNext(newTail);
            this.tail=newTail;
        }
    }
    
    public Node<T> get(int element){
        Node<T> target=this.head;
        int times = 0;
        while(times<element){
            target=target.getNext();
            times++;
        }
        return target;
    }
    
    public Node<T> getTail(){
        return this.tail;
    }
    
    public void setHead(T value){
        this.head.setValue(value);
    }
    
    public void setTail(T value){
        this.tail.setValue(value);
    }
    
}
