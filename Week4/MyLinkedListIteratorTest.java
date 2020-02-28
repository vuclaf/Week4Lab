

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyLinkedListIteratorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyLinkedListIteratorTest
{
    /**
     * Default constructor for test class MyLinkedListIteratorTest
     */
    public MyLinkedListIteratorTest()
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
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        testList.addEnd(1);
        testList.addEnd(2);
        testList.addEnd(3);
        testList.addEnd(4);
        testList.addEnd(5);
        MyLinkedListIterator<Integer> itr1 = new MyLinkedListIterator<Integer>(testList);
        assertEquals(true, itr1.hasNext());
        assertTrue(itr1.next()==1);
    }

    @Test
    public void secondCase()
    {
        MyLinkedList<Integer> testList2 = new MyLinkedList<Integer>();
        testList2.addFirst(4);
        testList2.addFirst(2);
        testList2.addFirst(0);
        testList2.addFirst(-2);
        MyLinkedListIterator<Integer> itr2 = new MyLinkedListIterator<Integer>(testList2);
        assertEquals(true, itr2.hasNext());
        assertTrue(itr2.next()==-2);
        itr2.remove();
        assertTrue(testList2.get(1).getValue()==2);
    }
}


