import java.util.List;

/**
 * Test the performance of a list
 */
public class PerformanceTester {
    /**
     * Test the add method of a list
     * @param list The list to test
     * @param iterations The number of iterations to perform
     */
    public static void testAdd(List<Integer> list, int iterations) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            list.add(i);
        }

        long endTime = System.currentTimeMillis();
        printResult("add", iterations, endTime - startTime);
    }

    /**
     * Test the delete method of a list
     * @param list The list to test
     * @param iterations The number of iterations to perform
     */
    public static void testDelete(List<Integer> list, int iterations) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            list.remove(0);
        }

        long endTime = System.currentTimeMillis();
        printResult("delete", iterations, endTime - startTime);
    }

    /**
     * Test the get method of a list
     * @param list The list to test
     * @param iterations The number of iterations to perform
     */
    public static void testGet(List<Integer> list, int iterations) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            list.get(i);
        }

        long endTime = System.currentTimeMillis();
        printResult("get", iterations, endTime - startTime);
    }

    /**
     * Test the contains method of a list
     * @param list The list to test
     * @param iterations The number of iterations to perform
     */
    public static void testContains(List<Integer> list, int iterations) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            list.contains(i);
        }

        long endTime = System.currentTimeMillis();
        printResult("contains", iterations, endTime - startTime);
    }

    /**
     * Test the addAll method of a list
     * @param list The list to test
     * @param elements The elements to add
     * @param iterations The number of iterations to perform
     */
    public static void testAddAll(List<Integer> list, List<Integer> elements, int iterations) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            list.addAll(elements);
        }

        long endTime = System.currentTimeMillis();
        printResult("addAll", iterations, endTime - startTime);
    }

    /**
     * Test the clear method of a list
     * @param list The list to test
     * @param iterations The number of iterations to perform
     */
    public static void testClear(List<Integer> list, int iterations) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            list.clear();
        }

        long endTime = System.currentTimeMillis();
        printResult("clear", iterations, endTime - startTime);
    }

    /**
     * Print the result of a test
     * @param method The method that was tested
     * @param iterations The number of iterations performed
     * @param time The time it took to perform the iterations
     */
    private static void printResult(String method, int iterations, long time) {
        System.out.println(method + " - Iterations: " + iterations + ", Time: " + time + " ms");
    }
}