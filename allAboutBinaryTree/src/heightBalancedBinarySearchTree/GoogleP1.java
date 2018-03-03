package heightBalancedBinarySearchTree;

//import java.util.*;

public class GoogleP1 {
// google 相邻相同数字删一位 输出最大
/*1.3 choose a group of(at least two) identical adjacent 
 *and remove a single digit
 *return max (e.g.223336226 -> 23336226)
*/
	    public static int solution13(int X) {
	    	StringBuilder strX = new StringBuilder(String.valueOf(X));
	    	int max = 0;
	    	for(int i = 0; i < strX.length() - 1; i++){
	    		StringBuilder sb = new StringBuilder(strX);
	    		if(strX.charAt(i) == strX.charAt(i + 1)) {
	    			sb.deleteCharAt(i);
	    			max = Math.max(max, Integer.parseInt(sb.toString()));
	    		}
	    		
	    	}
	    	return max;
	    }
	    
//google 相邻数字选大的，输出最小
/*1.1 replace two adjacent digits with the larger one， 
 * return min (e.g. 233614 -> 23364)
 */
	    public static int solution11(int X){
	    	StringBuilder strX = new StringBuilder(String.valueOf(X));
	    	int min = Integer.MAX_VALUE;
	    	for(int i = 0; i < strX.length() - 1; i++){
	    		StringBuilder sb = new StringBuilder(strX);
	    		sb = strX.charAt(i) > strX.charAt(i + 1) ? sb.deleteCharAt(i + 1) : sb.deleteCharAt(i);
	    		min = Math.min(min, Integer.parseInt(sb.toString()));
	    	}
	    	return min;
	    }
	    
	    
//google
/*1.2 replace two adjacent digits with the round up average，
 * return max (e.g. 623315 -> 63315)
 */
	    public static int solution12(int X){
	    	StringBuilder strX = new StringBuilder(String.valueOf(X));
	    	int max = Integer.MIN_VALUE;
	    	int avg = 0;
	    	for(int i = 0; i < strX.length() - 1; i++){
	    		StringBuilder sb = new StringBuilder(strX);
	    		avg = (int)Math.ceil((strX.charAt(i) - '0' + strX.charAt(i + 1) - '0') / 2.0);
	    		sb.replace(i, i + 2, String.valueOf(avg));
	    		max = Math.max(max, Integer.parseInt(sb.toString()));
	    	}
	    	return max;
	    }
	    
	
	    //test
	    public static void main(String[] args){
	    	System.out.println(""+solution12(14));
	    	System.out.println(""+solution13(2233566));
	    	System.out.println(""+solution11(23145));
	    }
}
