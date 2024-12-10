public class Algorithms {

    static int[] bubbleSort(int[] arr){

        for(int i=0; i< arr.length-1; i++){
            boolean isSwap = false;
            for(int j=0;j<arr.length-i-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap){
                System.out.println("Array is Already Sorted :)");
            }
        }
        return arr;
    }

    static int[] selectionSort(int[] arr){

        for(int i=0;i< arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j] < smallest){
                    int temp = arr[j];
                    arr[j] = smallest;
                    smallest = arr[j];
                }
            }
        }
        return arr;
    }

    static int[] insertionSort(int[] arr){
        for(int i=1;i< arr.length-1;i++){
            int curr = i;
            int prev = i-1;
            while(prev>=0 && prev>curr){
                 arr[prev+1] = arr[prev];
                 prev--;
            }
            arr[prev] = arr[curr];
        }

        return arr;
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length; i++){
            System.out.print("->" + arr[i]);
        }
        System.out.println();
    }
}
