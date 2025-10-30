package ArraysProblems.SortingAlgorithm;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        for(int i = arr.length-1;i>=1;i--){
            for(int j = 0;j<=i-1;j++){
                if(arr[j+1] < arr[j] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,0,1};
        bubbleSort(arr);
    }
}
