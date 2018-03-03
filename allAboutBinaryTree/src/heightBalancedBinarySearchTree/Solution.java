package heightBalancedBinarySearchTree;
/*
 * To check if a tree is height-balanced, get the height of left and right subtrees.
 * Return true if difference between height is not more than 1 
 * and left and right subtrees are balanced.
 * Otherwise, return false
 */

public class Solution {
    public static double maxAverage(int[] nums, int k) {
        // Write your code here
        double totalMax = Integer.MIN_VALUE;
        for(int n = k; n <= nums.length; n++){
            totalMax = Math.max(totalMax, findMaxAverageSubarray(nums, n));
            //System.out.println("totalMax when n = "+ n + " is "+ totalMax);
        }
        return totalMax;
    }
    public static double findMaxAverageSubarray(int[] nums, int k){
        long sum = 0;
        //long curMax = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        long curMax = sum;
        if(nums.length == k){
            return (double)sum / k;
        }
        for(int i = k; i < nums.length; i++){
            sum = sum + nums[i] - nums[i - k];
            curMax = Math.max(curMax, sum);
            
        }
        //System.out.println("curMax with n = " + k + " is " + curMax);
        return (double) curMax / k;
    }
	public static void main(String[] args){
		int[] array = {1, 12,-5, -6, 50, 3};
		int k = 3;
		System.out.println(maxAverage(array, k));
		
		
	}

}
