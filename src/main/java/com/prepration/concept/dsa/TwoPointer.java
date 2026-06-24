package com.prepration.concept.dsa;

public class TwoPointer {
    
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7,8,9};
        int target= 13;

        int i=0;
        int j= arr.length-1;

        while (arr[i]<arr[j]) {
            
            if(arr[i]+arr[j]==target){
                System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                break; // Exit the loop if a pair is found
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
    }
}
