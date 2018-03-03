package heightBalancedBinarySearchTree;

public class Badswap {
	
	public static void main(String[] args){
		int a = 5;
		int b = 3;
		
		badSwap(a ,b);
		System.out.println("a = " + a + " , b = " + b);
		
		int temp = a;
		a = b;
		b = temp;
		System.out.print("a = " + a + " , b = " + b);
	}
	private static void badSwap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
}
