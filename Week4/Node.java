/**
 * A Node class that has singly linked Node instances.
 * Each Node carries a value and a field that contains the address of the next node.
 */
public class Node<T>{
    private T value;
    private Node<T> next;
    
    /**
     * Constructor for the Node class
     * @param Value v that the Node contains and the Node next to it
     */
    public Node(T value, Node<T> next){
        this.value = value;
        this.next=next;
    }
    
    /**
     * A method that set the value of the node
     * @param New value v that the Node will contain
     */
    public void setValue(T value){
        this.value = value;
    }
    
    /**
     * A method that set the linked node that this node contains
     * @param Node next that will be linked to this node
     */
    public void setNext(Node<T> next){
        this.next = next;
    }
    
    /**
     * A method to get the value that the node contains
     * @return Value v that the Node contains
     */
    public T getValue(){
        return value;
    }
    
    /**
     * A method to get the next node that is linked to this one
     * @return the Node that this node is linked to 
     */
    public Node<T> getNext(){
        return next;
    }
}