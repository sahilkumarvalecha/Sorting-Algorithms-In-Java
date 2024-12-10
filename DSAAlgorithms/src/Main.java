public class Main {
    public static void main(String[] args) {

        int[] array = {9,5,7,6,3,1,8,4,2,0};

        System.out.println();
        System.out.print("Bubble Sort: ");
        Algorithms.printArray(Algorithms.bubbleSort(array));
        System.out.println("Time Complexity Big O(n^2)");
        System.out.println();

        System.out.print("Selection Sort: ");
        Algorithms.printArray(Algorithms.selectionSort(array));
        System.out.println("Time Complexity Big O(n^2)");
        System.out.println();

        System.out.print("Insertion Sort: ");
        Algorithms.printArray(Algorithms.insertionSort(array));
        System.out.println("Time Complexity Big O(n^2)");
        System.out.println();
    }
}