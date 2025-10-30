package ArraysProblems.SortingAlgorithm;

public class SelectionSort {
    static void selection_sort(int[] arr){
        for(int i = 0;i<=arr.length-2;i++){
            int min_index = i;
            for(int j = i;j<=arr.length-1;j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp; 
        }
        printArray(arr);
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{5,3,2,1};
        selection_sort(array);
    }
}
