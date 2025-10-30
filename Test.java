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
        // 
        secondLargest(arr);
    }
}
