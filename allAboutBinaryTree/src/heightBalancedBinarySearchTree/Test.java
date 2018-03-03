package heightBalancedBinarySearchTree;
class People{
	int age;
}
public class Test {
	public static void main(String[] args){
		int x = 50;
		People people = new People();
		people.age = 50;
		change(people);
		System.out.println(people.age);
		change(x);
		System.out.println(x);
	}
	private static void change(int val){
		val = val * 2;
		System.out.println("in change, x = " + val);
	}
	private static void change(People p){
		p.age = p.age * 2;
		System.out.println("in change, x = " + p.age);
	}
}
