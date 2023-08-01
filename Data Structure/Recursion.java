package com.temp;

public class Recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,11,0,arr.length-1));
        System.out.println(findNumber(4));
    }

    public static int binarySearch(int[] arr, int target, int s, int e) {
        if(s > e) {
            return -1;
        }
        int m = s + (e - s);
        if(arr[m] == target) {
            return m;
        }
        if(target < arr[m]) {
            return binarySearch(arr,target,s,m-1);
        }
        return binarySearch(arr,target,m+1,e);
    }

    public static int findNumber(int n) {
        if(n < 2) {
            return n;
        }
        return findNumber(n-1) + findNumber(n-2);
    }

    public static void printNumbers(int n) {
        if(n == 0)
            return;
        printNumbers(n-1);
        System.out.println(n);
    }

    public static boolean isSorted(int[] arr,int i) {
        boolean s;
        if(arr[i] > arr[i+1]) {
            s = false;
            return s;
        }
        if(i == arr.length-2) {
            s = true;
            return s;
        }
        s = isSorted(arr,i+1);
        return s;
    }
}
