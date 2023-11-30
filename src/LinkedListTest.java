import java.util.LinkedList;

/**
 * Test the methods of a LinkedList
 */
public class LinkedListTest {
    LinkedList<Integer> linkedList = new LinkedList<>();

    /**
     * Test the methods of a LinkedList
     * @param iterations The number of iterations to perform
     */
    public void tester(int iterations) {
        System.out.println("/// LinkedList Test ///");
        PerformanceTester.testAdd(linkedList, iterations);
        PerformanceTester.testContains(linkedList, iterations);
        PerformanceTester.testGet(linkedList, iterations);
        PerformanceTester.testDelete(linkedList, iterations);
        PerformanceTester.testAddAll(linkedList, linkedList, iterations);
        PerformanceTester.testClear(linkedList, iterations);
        System.out.println("/// LinkedList Test ///\n");
    }
}