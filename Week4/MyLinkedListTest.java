

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyLinkedListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyLinkedListTest
{
    /**
     * Default constructor for test class MyLinkedListTest
     */
    public MyLinkedListTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void firstCase()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addFirst(1);
        myLinked1.addEnd(2);
        myLinked1.addFirst(0);
        Node<java.lang.Integer> node3 = (Node<java.lang.Integer>)myLinked1.get(2);
        assertEquals(node3, myLinked1.get(2));
        assertTrue(node3.getValue()==2);
    }

    @Test
    public void secondCase()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addEnd(1);
        myLinked1.addFirst(0);
        Node<Integer> node1 = new Node<Integer>(2, null);
        Node<Integer> node2 = new Node<Integer>(3, null);
        myLinked1.setHead(node1);
        myLinked1.setTail(node2);
        assertTrue(myLinked1.getTail().getValue()==3);
        assertTrue(myLinked1.get(0).getValue()==2);
    }
}


