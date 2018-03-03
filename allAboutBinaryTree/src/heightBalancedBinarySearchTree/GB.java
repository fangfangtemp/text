package heightBalancedBinarySearchTree;

public class GB {
	public static char[] sort(char[] ch) {
		if(ch == null || ch.length == 0) {
			return new char[0];
		}
		int i = 0, j = ch.length - 1;
		// i -> index of Girl
		// j -> index of Boy
		while(i < j) {
			while(i < j && ch[i] == 'G') {
				i++;
			}
			while(i < j && ch[j] == 'B') {
				j--;
			}
			if(i > j) {
				break;
			}
			swap(ch, i, j);
			i++;
			j--;
		}
		return ch;
	}
	public static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
	public static void main(String[] args) {
		char[] ch = {'B', 'G', 'B', 'G', 'B'};
		char[] res = sort(ch);
		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
