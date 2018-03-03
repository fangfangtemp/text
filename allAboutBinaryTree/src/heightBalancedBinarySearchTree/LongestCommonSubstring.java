package heightBalancedBinarySearchTree;

public class LongestCommonSubstring {
//input: "ABBC" "BBBD"
//return: 2
	public static int longestCommonSubstring(String str1, String str2){
		if(str1 == null || str1.length() == 0) return 0;
		if(str2 == null || str2.length() == 0) return 0;
		
		int m = str1.length();
		int n = str2.length();
		int[][] dp = new int[m + 1][n + 1];
		
		for(int i = 1; i <= m; i++){
			for(int j = 1; j <= n; j++){
				if(str1.charAt(i - 1) == str2.charAt(j - 1)){
					dp[i][j] = dp[i - 1][j - 1] + 1;
				}else{
					dp[i][j] = 0;
				}
				
			}
		}
		
		int max = dp[0][0];
		for(int i = 0; i <= m; i++){
			for(int j = 0; j <= n; j++){
				max = Math.max(max, dp[i][j]);
			}
		}
		return max;
	}
	
	public static void main(String[] args){
		System.out.print(longestCommonSubstring("ABCD", "D"));
	}
}
