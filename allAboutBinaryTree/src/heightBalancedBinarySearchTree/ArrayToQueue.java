package heightBalancedBinarySearchTree;
class ArrayQueue{
	static int[] arr;
	static int front;
	static int rear;
	public ArrayQueue(int size){
		arr = new int[size];
		front = 0;
		rear = -1;
	}
	// to check if the queue is empty
	public static boolean isEmpty(){
		return front == arr.length;
	}
	// to check if the queue is full
	public static boolean isFull(){
		return rear == arr.length - 1;
	}
	// insert the item to the end of queue
	public static void insert(int item){
		if(isFull()){
			throw new RuntimeException("Queue is full");
		}
		arr[++rear] = item;
	}
	// get the peek element from the queue
	public static int peekFront(){
		return arr[front];
	}
	// get the tail element from the queue 
	public static int peekRear(){
		return arr[rear];
	}
	// remove and return the peek element
	public static int remove(){
		if(isEmpty()){
			throw new RuntimeException("Queue is empty");
		}
		return arr[front++];
	}
}
public class ArrayToQueue {
	// test
	public static void main(String[] args){
		ArrayQueue queue = new ArrayQueue(10);
		System.out.println("The queue is Empty? " + queue.isEmpty());
		for(int i = 1; i < 5; i++){
			queue.insert(i);
		}
		System.out.println("The queue is Empty? " + queue.isEmpty());
		System.out.println("We are gonna remove the peek element: " + queue.remove());
		System.out.println("Now, the peek element is: " + queue.peekFront());
		
	}

}
