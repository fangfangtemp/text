package heightBalancedBinarySearchTree;
import java.util.*;
public class TEStss {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int size = 1;
        int[] arr = {1};
        int[] res = new int[size];
        int i = size - 1;
        int left = 0, right = size - 1;
        while(left < right) {
            res[left++] = arr[i--];
            res[right--] = arr[i--];
        }
        if(left == right) {
            res[left] = arr[i];
        }
        for(int j = 0; j < size - 1; j++) {
            System.out.print(res[j] + " ");
        }
        System.out.println(res[size - 1]);

        System.out.printf("It's Sunday Evening");
        System.out.printf("It's monday and everything gonna be better");
    }
}
