package heightBalancedBinarySearchTree;

public class Sorting {
	
	public static void main(String[] args){
		int[] array = {2, 0 , -1, 3, 9, 4};
		//quickSort(array, 0, array.length - 1);
		mergeSort(array, 0, array.length - 1);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]+" ");
		}
	}
// quick sort
	/*
	public static void quickSort(int[] array, int low, int high){
		if(low >= high) return;
		int pivot = array[(low + high) / 2];
		int left = low, right = high;
		while(left <= right) {
			while(left <= right && array[right] > pivot) {
				right--;
			}
			while(left <= right && array[left] < pivot) {
				left++;
			}
			if(left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}
		}
		quickSort(array, low, right);
		quickSort(array, left, high);
	}
	*/
	public static void mergeSort(int[] array, int start, int end) {
		if(start >= end) {
			return;
		}
		int mid =  (start + end) / 2;
		mergeSort(array, start, mid);
		mergeSort(array, mid + 1, end);
		merge(array, start, end);
	}
	public static void merge(int[] array, int start, int end) {
		int[] temp = new int[array.length];
		int mid = (start + end) / 2;
		int leftIndex = start;
		int rightIndex = mid + 1;
		int i = start; 
		while(leftIndex <= mid && rightIndex <= end){
			if(array[leftIndex] < array[rightIndex]) {
				temp[i++] = array[leftIndex++];
			}else {
				temp[i++] = array[rightIndex++];
			}
		}
		while(leftIndex <= mid) {
			temp[i++] = array[leftIndex++];
		}
		while(rightIndex <= end) {
			temp[i++] = array[rightIndex++];
		}
		for(int j = start; j <= end; j++) {
			array[j] = temp[j];
		}
	}
	
	public static void swap(int[] array, int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	

}
