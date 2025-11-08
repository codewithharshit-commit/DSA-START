public class Test {
    static int findLargest(int[] arr){
        int n = arr.length;
        int max = arr[0];
        for(int i = 1;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void secondLargest(int[] arr){
        int secondMax;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == findLargest(arr)){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        secondMax = findLargest(arr);
        System.out.println(secondMax);
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,2,0,0,1}; 
        //secondLargest(arr);
        int[] newArr = {1,0,1,0,0,1,1,0};
        SortZeroAndOneArray.sortZeroAndOneArray(newArr);
    }
}

class SortZeroAndOneArray{
    static void sortZeroAndOneArray(int[] arr){
        int len = arr.length;
        int zeroCount = 0;
        for(int i=0;i<len;i++){
            if(arr[i]==0) zeroCount++;
        }
        int[] newArray = new int[len];
        for(int j=0;j<zeroCount-1;j++){
            arr[j] = 0;
        }
        for(int j=zeroCount;j<len;j++){
            arr[j] = 1;
        }
        for(int i = 0;i<len;i++){
            System.out.print(arr[i]);
        }
    }
}
