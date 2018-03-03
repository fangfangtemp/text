package heightBalancedBinarySearchTree;

public class SplitByWhitespaces {
	public static void main(String[] args){
		String s1 = "   Hello    World";
		String s2 = " ";
		String[] s11 = s2.split(" ");
		String[] s12 = s1.split("\\s+");
		
		for(int i = 0; i < s11.length; i++){
			System.out.println(s11[i]);
		}
		for(int i = 0; i < s12.length; i++){
			System.out.println(s12[i]);
		}
		System.out.print(s2.trim());
	}

}
