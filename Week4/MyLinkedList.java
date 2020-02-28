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
     * Create an iterator for the list
     */
    public Iterator<T> iterator()
    {
        return new MyLinkedListIterator<T>(this);
    }
    
    /**
     * Add a value to the front of the list
     * @param value that needs to be added
     */
    public void addFirst(T value){
        if (this.head==null){
            Node<T> newHead = new Node<T>(value, null);
            this.head=newHead;
        }
        else{
            Node<T> newHead = new Node<T>(value,this.head);
            this.head=newHead;
        }
    }
    
    /**
     * Add a value to the front of the list
     * @param value that needs to be added
     */
    public void addEnd(T value){
        if (this.head==null){
            Node<T> newHead = new Node<T>(value, null);
            this.head=newHead;
        }
        else if (this.tail==null) {
            Node<T> newTail = new Node<T>(value,null);
            this.tail=newTail;
            this.head.setNext(tail);
        }
        else{
            Node<T> newTail = new Node<T>(value,null);
            tail.setNext(newTail);
            this.tail=newTail;
        }
    }
    
    /**
     * A method to get the node at a wanted position
     * @param index of the wanted node
     * @return the node wanted
     */
    public Node<T> get(int element){
        Node<T> target=this.head;
        int times = 0;
        while(times<element){
            target=target.getNext();
            times++;
        }
        return target;
    }
    
    /**
     * A method to get the tail node
     * @return the tail node
     */
    public Node<T> getTail(){
        return this.tail;
    }
    
    /**
     * A method to get the head node of the list
     * @return the head node
     */
    public void setHead(Node<T> newHead){
        newHead.setNext(this.head.getNext());
        this.head=newHead;
    }
    
    /**
     * A method to set the tail of the list to a new node
     * @param the new tail
     * 
     */
    public void setTail(Node<T> newTail){
        Iterator<T> itr = new MyLinkedListIterator<T>(this);
        int i =0;
        //increment to the penultimate node and set the next node of that node to the new tail
        while (itr.hasNext() && !itr.next().equals(this.tail)){
            i++;
        }
        this.get(i-1).setNext(newTail);
        this.tail=newTail;
    }
    
}
