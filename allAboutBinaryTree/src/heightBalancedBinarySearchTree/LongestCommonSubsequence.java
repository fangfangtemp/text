package heightBalancedBinarySearchTree;

public class LongestCommonSubsequence {
	// input: "ABCD" "EACB" 
	// return: 2 ("AC")

	public static int lCS(String A, String B){
		int m = A.length();
		int n= B.length();
		int[][] f = new int[m + 1][n + 1];
		for(int i = 1; i <= m; i++){
			for(int j = 1; j <= n; j++){
				if(A.charAt(i - 1) == B.charAt(j - 1)){
					f[i][j] = f[i - 1][j - 1] + 1;
				}
				else{
					f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
				}
			}
		}
		return f[m][n];
	}
	
	public static void main(String[] args){
		System.out.print(""+lCS("ABCD", "EACB"));
	}
}
