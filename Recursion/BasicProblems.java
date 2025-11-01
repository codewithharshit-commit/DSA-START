package Recursion;

public class BasicProblems {
  
    static void swap(int i,int j){
        int temp = i;
        i = j;
        j = temp;
    }

    static void printNames(int i,int n){
        if(i>n) return;
        System.out.println("Harshit");
        printNames(i+1,n);
    }

    static void printNumbers(int i,int n){
        if(i>n) return;
        System.out.println(i);
        printNumbers(i+1, n);
    }
    //Parameterised recursive sum
    static void sumNum(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sumNum(i-1,sum+i);
    }
    //functional recursive sum
    static int functionalRecursiveSum(int n){
        if(n==0) return 0;
        return n + functionalRecursiveSum(n-1);
    }
    //reverse an  array
    static void f(int i,int[] arr){
        if(i>=arr.length/2) return;
        swap(arr[i],arr[arr.length-i-1]);
        f(i+1,arr);
    }

    public static void main(String[] args) {
        sumNum(5, 0);
        System.out.println(functionalRecursiveSum(5));
        int[] arr = {1,2,3,4,5};
        f(0, arr);
        for(int k = 0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
