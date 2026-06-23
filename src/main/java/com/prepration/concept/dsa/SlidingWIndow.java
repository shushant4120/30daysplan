package com.prepration.concept.dsa;

public class SlidingWIndow {
    
    public static void main(String args[]){

        int[] arr= {1,3,-6,3,-5,6,-7,2};
int k= 3;
int sum=0;
for(int i=0;i<k;i++){
sum+=arr[i];

}
int maxSum= 0;
for(int i=k;i<arr.length;i++){

    sum=sum+ arr[i]-arr[i-k];
    maxSum= Math.min(maxSum, sum);
}
System.out.println(maxSum);
}
}
