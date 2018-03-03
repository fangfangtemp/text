package heightBalancedBinarySearchTree;
import java.util.*;
public class Boomerang {
    public static int numberOfBoomerangs(int[][] points) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int res = 0;
        for(int i = 0; i < points.length; i++) {
            for(int j = 0; j < points.length; j++) {
                if(i == j) {
                    continue;
                }
                int distance = getDistance(points[i], points[j]);
                map.put(distance, map.getOrDefault(distance, 0) + 1);
            }
            for(int val : map.values()){
                res += val * (val - 1);
                System.out.println("i = " + i);
                System.out.println("when value = " + val + ", res = " + res);
            }
            map.clear();
        }
        return res;
    }
    private static int getDistance(int[] a, int[] b) {
        int deltaX = a[0] - b[0];
        int deltaY = a[1] - b[1];
        return deltaX * deltaX + deltaY * deltaY;
    }
    public static void main(String[] args) {
    	/*
    	int[][] points = {{1, 0}, {2, 0}, {0, 0}, {-1, 0}};
    	int res = numberOfBoomerangs(points);
    	System.out.println("result :" + res);
    	System.out.println( 10 * 1.0 % 2.0);
    	*/
    	System.out.println(multiply("123", "45"));
    }
    public static String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];
       
        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = (sum) % 10;
            }
        }  
        
        StringBuilder sb = new StringBuilder();
        for(int p : pos) {
        	if(!(sb.length() == 0 && p == 0)) {
        		sb.append(p);
        	}
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
