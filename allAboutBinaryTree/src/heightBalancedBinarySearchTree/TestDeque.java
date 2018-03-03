package heightBalancedBinarySearchTree;
import java.util.*;
public class TestDeque {
	/*
	public static void main(String[] args) {
		Deque<Integer> stk = new LinkedList<>();
		stk.add(1);
		stk.add(2);
		stk.add(3);
		System.out.println("peekFirst: " + stk.peekFirst());
		System.out.println("peekLast: " + stk.peekLast());
	}
	
	public static void main(String[] args) {
		String[] strs = new String[3];
		strs[0] = "abcd";
		strs[1] = "abdc";
		strs[2] = "acd";
		System.out.println(longestCommonPrefix(strs));
	}
	*/
	
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        String pre = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        return pre;
    }
    public static int longestCommonSubsequence(String A, String B) {
        // write your code here
        int m = A.length();
        int n = B.length();
        int[][] f = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++) {
        	System.out.print("i = " + i);
            for(int j = 1; j <= n; j++) {
                f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
                if(A.charAt(i - 1) == B.charAt(j - 1)) {
                    f[i][j] = f[i - 1][j - 1] + 1;
                }
                System.out.print(" j = " + j + " f[i][j] = " + f[i][j]);
            }
            System.out.println();
        }
        return f[m][n];
    }
    public static void main(String[] args) {
		String a = "abcd";
		String b = "adc";
		System.out.println("result: " + longestCommonSubsequence(a, b));
		System.out.println("Integer max value: " + Integer.MAX_VALUE);
	}
}
