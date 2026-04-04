package com.prepration.concept.problems;

public class SlidingWindow {
    
    public static int maxSlidingWindow(int[] nums, int k) {
       
        int sum= 0;
        int result =0;
        if(nums ==null || nums.length==0 || k == 0){ return 0;}

        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            if(i>=k-1){
                result = Math.max(result, sum);
                sum -= nums[i-k+1];
            }
        }


        return sum;
    }
    public int maxSumSubarray(int[] arr, int k) {
    int sum = 0;

    // Step 1: first window
    for (int i = 0; i < k; i++) {
        sum += arr[i];
    }

    int max = sum;

    // Step 2: slide window
    for (int i = k; i < arr.length; i++) {
        sum = sum - arr[i - k]; // remove left
        sum = sum + arr[i];     // add right
        max = Math.max(max, sum);
    }

    return max;
}
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        
        int maxSum = maxSlidingWindow(arr, k);
        System.out.println("Maximum sum of a sliding window of size " + k + " is: " + maxSum);

        
    }
}
