

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyLinkedListContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyLinkedListContainerTest
{
    /**
     * Default constructor for test class MyLinkedListContainerTest
     */
    public MyLinkedListContainerTest()
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
        MyLinkedListContainer<Integer> container1 = new MyLinkedListContainer<Integer>();
        container1.addToBack(3);
        container1.addToFront(2);
        container1.addToFront(1);
        assertEquals(2, container1.searchWOIterator(3));
    }

    @Test
    public void secondCase()
    {
        MyLinkedListContainer<String> myLinked1 = new MyLinkedListContainer<String>();
        myLinked1.addToFront("T");
        myLinked1.addToBack("E");
        myLinked1.addToBack("A");
        myLinked1.addToBack("M");
        assertEquals(1, myLinked1.searchWithIterator("E"));
        assertEquals(-1, myLinked1.searchWithIterator("I"));
    }
}


