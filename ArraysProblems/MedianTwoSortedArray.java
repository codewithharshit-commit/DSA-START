package ArraysProblems;

import java.util.Arrays;

public class MedianTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lengthNums1 = nums1.length;
        int lengthNums2 = nums2.length;
        double result;
        int[] mergedArray = new int[lengthNums1 + lengthNums2];
        for(int i=0;i<nums1.length;i++){
            mergedArray[i] = nums1[i];
        }
        int k=0;
        for(int j=nums1.length;j<mergedArray.length;j++){
            mergedArray[j] = nums2[k++];
        }
        Arrays.sort(mergedArray);
        if(mergedArray.length%2 != 0){
            result = mergedArray[((mergedArray.length + 1)/2)-1];
        }else{
            result = (mergedArray[mergedArray.length/2] + mergedArray[(mergedArray.length/2)-1])/2.0 ;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
}
