package ArraysProblems;

import java.util.*;

class PrintAlternates {

    static ArrayList<Integer> getAlternates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(getAlternates(arr));
    }
}

// Time complexity O(N) --> N is the no of elements in an array