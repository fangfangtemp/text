package heightBalancedBinarySearchTree;


public class MedianOfTwoSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(m > n) {
        	return findMedianSortedArrays(nums2, nums1);
        }
        int iMin = 0;
        int iMax = m;
        int i = (iMin + iMax) / 2;
        int j = (m + n + 1) / 2 - i;
        while(iMin <= iMax) {
        	i = (iMin + iMax) / 2;
        	j = (m + n + 1) / 2 - i;
        	if((i > 0) && nums1[i - 1] > nums2[j]) {
        		// i is too big
        		iMax = i - 1;
        	}else if((i < m) && nums1[i] < nums2[j - 1]) {
        		// i is too small
        		iMin = i + 1;
        	}else{
        		break;
        	}
        }
        int left; // max of left
        if(i == 0) {
        	left = nums2[j - 1];
        }else if(j == 0) {
        	left = nums1[i - 1];
        }else {
        	left = Math.max(nums1[i - 1], nums2[j - 1]);
        }
        if((m + n) % 2 == 1) {
        	return (double)left;
        }
        int right; // min of right
        if(i == m) {
        	right = nums2[j];
        }else if(j == n) {
        	right = nums1[i];
        }else {
        	right = Math.min(nums1[i], nums2[j]);
        }
        return (left + right) / 2.0;
        
        
    }
	public static void main(String[] args){
		int[] a = new int[]{1,2};
		int[] b = new int[]{3,4};
		System.out.println(findMedianSortedArrays(a, b));
	}

}
