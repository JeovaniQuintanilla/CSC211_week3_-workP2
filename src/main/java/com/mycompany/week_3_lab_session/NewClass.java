
package com.mycompany.week_3_lab_session;


public class NewClass {
 
    public boolean isPrime(int b){
         for (int i = 2; i < b; i++ ){
            if (b%i == 0) return false;
     }
         return true;
         
    }
     int getPrimeSum(int[] nums){
        int sm=0;
        for(int i=0; i<nums.length; i++){
            if(isPrime(nums[i])){
                sm+=nums[i];
            }
        }
        return sm;
    }
    
     public static void main(String[] args) {
        NewClass nc= new NewClass();
        int[] arr={3,4,8,7,9,10,12,5,11};
        
        int sum = nc.getPrimeSum(arr);
        System.out.println("The sum of the primes in the array is "+ sum );
     }
}

