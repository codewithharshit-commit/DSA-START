package ArraysProblems;
import java.util.ArrayList;
import java.util.Collections;

//Given an array arr[] of size n, the task is to find all the Leaders in the array. An element is a Leader if it is greater than or equal to all the elements to its right side.
public class LeaderInArray {
    static ArrayList<Integer> getLeaderArray(int[] array) {
        ArrayList<Integer> res = new ArrayList<>();
        int length = array.length;
        //native approach O(n^2)
        for(int i = 0;i<length;i++){
            int j;
            for (j = i+1; j<length; j++) {
                if(array[i] < array[j]){
                    break;
                }
            }
            if(j==length){
                res.add(array[i]);
            }
        }
        return res;
    }
    static ArrayList<Integer> Leaders(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        int len = arr.length;
        // rightmost element is always a leader
        int maxElement = arr[len-1];
        res.add(maxElement);
        // using suffix sum O(n)
        for(int i = len-2;i>=0;i--){
            if(arr[i] > maxElement){
                maxElement = arr[i];
                res.add(maxElement);
            }
        }
        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args) {
        int[] array = new int[]{10,2,4,6,8};
        System.out.println(getLeaderArray(array));
    }
}
