// Author: Degtyarev Mikhail
// Date: 28 Nov 2023

public class Main {
    /**
     * Run the tests
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        ArrayListTest arrayListTest = new ArrayListTest();
        LinkedListTest linkedListTest = new LinkedListTest();

        int[] iterations = {1000, 10000, 100000};

        for (int i : iterations) {
            System.out.println("===== Iterations: " + i + " =====");
            arrayListTest.tester(i);
            linkedListTest.tester(i);
        }
    }
}