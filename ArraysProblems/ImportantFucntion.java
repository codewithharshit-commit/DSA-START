package ArraysProblems;

public class ImportantFucntion {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int len = arr.length;
        for(int i = 0;i<len;i++){
            if(arr[i] < min){
                min = i;
            }
        }
        return min;
    }
}
