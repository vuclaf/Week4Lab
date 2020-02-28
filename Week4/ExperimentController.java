import java.util.*;
import java.io.*;

/**
 * A testing and timing class for the IntegerList class
 * @author Evan Vu
 *
 */
public class ExperimentController {
    public static void main(String[] args) {
        ExperimentController tester = new ExperimentController();
        tester.dataOut();
    }
    
    /**
     * Testing and timing the performance of searching with iterator
     * @return The runtime for the search
     */
    public long timeWOIterator(int numberOfItems, int seed) {
        Random rand = new Random(seed);
        MyLinkedListContainer<Integer> timeRun = new MyLinkedListContainer<Integer>();
        int i=0;

        while(i<numberOfItems) {
            timeRun.addToBack(rand.nextInt(100-0)+0);
            i++;
        }
        long startTime = System.nanoTime();
        timeRun.searchWOIterator(rand.nextInt(100-0)+0);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    
    /**
     * Testing and timing the performance of searching with iterator
     * @return The runtime for the search
     */
    public long timeWithIterator(int numberOfItems, int seed) {
        Random rand = new Random(seed);
        if (seed==0) return 0;
        MyLinkedListContainer<Integer> timeRun = new MyLinkedListContainer<Integer>();
        int i=0;
        while(i<numberOfItems) {
            timeRun.addToBack(rand.nextInt(100-0)+0);
            i++;
        }
        long startTime = System.nanoTime();
        timeRun.searchWithIterator(rand.nextInt(100-0)+0);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    
    /**
     * Writing results on to a text file for data analysis
     * @return an output file for data analysis
     */
    public void dataOut(){
        long executionWithIterator;
        long executionWOIterator;
        PrintWriter writer = null;
        try{
            writer = new PrintWriter(new File("output.txt"));
            for(int i=0; i<=100; i+=5){
                executionWithIterator = timeWithIterator(i, (int) System.nanoTime());
                executionWOIterator = timeWOIterator(i, (int) System.nanoTime());
                writer.println(executionWithIterator + " " + executionWOIterator);
            }
            writer.close();
        }
        catch(Exception e){
            System.out.println("Exception ocurred: " + e);
        }
          
    }
}