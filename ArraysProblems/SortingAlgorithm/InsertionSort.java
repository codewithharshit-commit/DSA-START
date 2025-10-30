package ArraysProblems.SortingAlgorithm;

public class InsertionSort {
    static void insertion_sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<=n-1;i++){
            int j =i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
