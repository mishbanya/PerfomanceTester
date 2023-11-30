import java.util.ArrayList;

/**
 * Test the methods of an ArrayList
 */
public class ArrayListTest {
    ArrayList<Integer> arrayList = new ArrayList<>();

    /**
     * Test the methods of an ArrayList
     * @param iterations The number of iterations to perform
     */
    public void tester(int iterations) {
        System.out.println("/// ArrayList Test ///");
        PerformanceTester.testAdd(arrayList, iterations);
        PerformanceTester.testContains(arrayList, iterations);
        PerformanceTester.testGet(arrayList, iterations);
        PerformanceTester.testDelete(arrayList, iterations);
        PerformanceTester.testAddAll(arrayList, arrayList, iterations);
        PerformanceTester.testClear(arrayList, iterations);
        System.out.println("/// ArrayList Test ///\n");
    }
}