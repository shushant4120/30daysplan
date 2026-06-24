package com.prepration.concept.dsa;

public class TwoPointer {
    
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7,8,9};
        int target= 13;

        int i=0;
        int j= arr.length-1;

       while(i<j){
        int sum= arr[i]+arr[j];
        if(sum== target){
            System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
            break;
        }
        else if (sum<target){
            i++;
        }
        else{
            j--;
        }
       }
    }
}
