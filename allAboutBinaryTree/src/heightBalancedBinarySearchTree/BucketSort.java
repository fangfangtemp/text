package heightBalancedBinarySearchTree;
import java.util.*;
public class BucketSort {
	public static int maximumGap(int[] nums) {
        if(nums==null || nums.length<2)
            return 0;
            
        int min=nums[0];
        int max=nums[0];
        for(int n: nums){
            min=Math.min(min, n);
            max=Math.max(max, n);
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        if(min==max)
            return 0;
            
        int n=nums.length;
        
        int gap = (int)Math.ceil((double)(max-min)/(n-1));
        System.out.println("gap: " + gap);
        int bucketMin[] = new int[n];
        int bucketMax[] = new int[n];
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);
        
        for(int num: nums){
            int i=(num-min)/gap;
            bucketMin[i] = Math.min(bucketMin[i], num);
            System.out.println("bucketMin[" + i + "] = " + bucketMin[i]);
            bucketMax[i] = Math.max(bucketMax[i], num);
            System.out.println("bucketMax[" + i + "] = " + bucketMax[i]);
        }
        
    
        for(int i=0;i<bucketMin.length;++i){
            if(bucketMin[i]!=Integer.MAX_VALUE){
                gap = Math.max(gap, bucketMin[i]-min);
                min = bucketMax[i];
            }
        }
        
        return gap;
    }
	public static void main(String[] args) {
		int[] nums = {3, 1, 5, 2};
		System.out.println("answer: " + maximumGap(nums));
	}
}
