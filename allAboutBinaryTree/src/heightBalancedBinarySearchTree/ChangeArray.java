package heightBalancedBinarySearchTree;

import java.util.*;

public class ChangeArray {
	   public static void main(String[] args) {
	        //Scanner in = new Scanner(System.in);
	        //int n = in.nextInt();
		   int n = 1;
	        while(n-- > 0) {
	            //int size = in.nextInt();
	        	int size = 3;
	            //int k = in.nextInt();
	        	int k = 2;
	            int[] arr = new int[size * 2];
	            for(int i = 0; i < arr.length; i++) {
	                arr[i] = i + 1;
	            }
	            while(k-- > 0) {
	                int[] res = change(arr);
	                arr = res;
	            }
	            for(int i = 0; i < arr.length - 1; i++) {
	                System.out.print(arr[i] + " ");
	            }
	            System.out.println(arr[arr.length - 1]);
	        }
	    }
	    public static int[] change(int[] arr) {
	        int[] res = new int[arr.length];
	        int i = 0, j = arr.length / 2;
	        int index = 0;
	        while(index < arr.length) {
	            if(index % 2 == 0) {
	                res[index++] = arr[i++];
	            }else {
	                res[index++] = arr[j++];
	            }
	        }
	        return res;
	    }
}
