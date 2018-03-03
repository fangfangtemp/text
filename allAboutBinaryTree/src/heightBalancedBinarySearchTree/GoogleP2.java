package heightBalancedBinarySearchTree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/*
 *  Given String s = "dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif";
 *  dir1
 *   dir11
 *   dir12
 *    picture.jpeg
 *    dir121
 *    file1.txt
 *  dir2
 *   file2.gif
 *  
 *  So image paths are /dir1/dir12/picture.jpeg and /dir2/file2.gif
 */
public class GoogleP2 {
	
/* 1.4 return total image path to root (return 39)
	* /dir1/dir12/picture.jpeg    24
	* /dir2/file2.gif    15
	*/
	public static int solution14(String s){
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(0);
		int max = 0;
		for(String str : s.split("\n")){
			int level = str.lastIndexOf(" ") + 1;
			int len = str.length() - level;
			
			while(stack.size() > level + 1){
				stack.pop();
			}
			if(str.contains(".jpeg") || str.contains(".gif") || str.contains(".png")){
				max += stack.peek() + len + 1;
				
			}else{
				stack.push(stack.peek() + len + 1);
			}
			
		}
		return max;
	}
	
	/* 1.2 return longest image path to root (return 24)
	* /dir1/dir12/picture.jpeg    24
	* /dir2/file2.gif    15
	*/
	
	public static int solution12(String s){
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(0);
		int max = 0;
		for(String str : s.split("\n")){
			int level = str.lastIndexOf(" ") + 1;
			int len = str.length() - level;
			
			while(stack.size() > level + 1){
				stack.pop();
			}
			if(str.contains(".jpeg") || str.contains(".gif") || str.contains(".png")){
				max = Math.max(max, stack.peek() + len + 1);
				
			}else{
				stack.push(stack.peek() + len + 1);
			}
			
		}
		return max;
	}
	
	/* 1.1 return longest image path to root (return 11)
	* /dir1/dir12   11
	* /dir2    5
	*/
	
	public static int solution11(String s){
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(0);
		int max = 0;
		for(String str : s.split("\n")){
			int level = str.lastIndexOf(" ") + 1;
			int len = str.length() - level;
			while(stack.size() > level + 1){
				stack.pop();
			}
			if(str.contains(".jpeg") || str.contains(".gif") || str.contains(".png")){
				max = Math.max(max, stack.peek());
				
			}else{
				stack.push(stack.peek() + len + 1);
			}
			
		}
		return max;
	}
	
	/* 1.3 return total image path to root (return 16)
	* /dir1/dir12    11
	* /dir2    5
	*/
	public static int solution13(String s){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		int max = 0;
		for(String str : s.split("\n")){
			int level = str.lastIndexOf(" ") + 1;
			int len = str.length() - level;
			while(stack.size() > level + 1){
				stack.pop();
			}
			if(str.contains(".jpeg") || str.contains(".gif") || str.contains(".png")){
				max += stack.peek() ;
			}else{
				stack.push(stack.peek() + len + 1);
			}
		}
		return max;
	}
	
	
	public static void main(String[] args){
		String s = "dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif";
		System.out.println(""+solution13(s));
	}
	

}
