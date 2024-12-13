import javax.swing.*;

public class Algorithms {

    //Bubble Sort
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
    //Selection Sort
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
    //Insertion Sort
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
    //Merge Sort
    static void division(int[]arr,int start, int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        division(arr,start,mid);
        division(arr,mid+1,end);
        Merge(arr,start,mid,end);
    }
    static void Merge(int[] arr,int start,int mid, int end){
       int array1_index = start;
       int array2_index = mid+1;
       int[] merge = new int[end-start+1];
       int i=0;

       while(array1_index<=mid && array2_index<=end) {
           if (arr[array1_index] > arr[array2_index])
               merge[i++] = arr[array2_index++];
           else
               merge[i++] = arr[array1_index++];
       }
           while(array1_index<=mid){
               merge[i++] = arr[array1_index++];
           }
           while(array2_index<=end){
               merge[i++] = arr[array2_index++];
           }
           for(int k=0,j=start;k<merge.length;k++,j++){
               arr[j] = merge[k];
        }
    }
    //Printing Arrays
    static void printArray(int[] arr){
        for(int i=0;i<arr.length; i++){
            System.out.print("->" + arr[i]);
        }
        System.out.println();
    }
}
