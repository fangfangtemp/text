package heightBalancedBinarySearchTree;

public class SegmentTree {
	
	// find the min value of the tree
	// update(int index, int value)
	public static int[] constructSegmentTree(int[] array) {
		int n = array.length;
		int[] nums = new int[2 * n];
		for(int i = 0; i < n; i++) {
			nums[i + n] = array[i];
		}
		for(int i = n - 1; i > 0; i--){
			nums[i] = Math.min(nums[2*i], nums[2*i + 1]);
		}
		return nums;
	}
	public static void update(int[] array, int index, int newValue) {
		array[index] = newValue;
		int[] nums = constructSegmentTree(array);
		int n = array.length;
		int i = index + n;
		while(i > 1) {
			i = i / 2;
			nums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
		}
	}
	
	public static int getMin(int[] array) {
		int[] data = constructSegmentTree(array);
		return data[1];
	}
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 7, 1, 2, 5, 7};
		System.out.println(getMin(array));
		update(array, 1, 0);
		System.out.println(getMin(array));
	}

}
