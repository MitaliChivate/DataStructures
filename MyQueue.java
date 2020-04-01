import java.lang.reflect.Array;
//A generic class that represents queue data structure

public class MyQueue<T> {
	private int front; // variable that points to front most element of queue
	private int rear; // variable that points to rear most element of queue
	private int size; // size of queue
	private int maxSize; // maximum size of queue
	private T valuesOfElements[]; // array of elements that holds the input values

	public MyQueue(Class<T> element, int maxSize) {
		this.front = 0;
		this.rear = -1;
		this.size = 0;
		this.maxSize = maxSize;
		valuesOfElements = (T[]) Array.newInstance(element, maxSize);
	}

	// Method to insert elements into queue
	public void enqueue(T t) {
		if (size == maxSize) {
			return;
		}
		if (rear == maxSize - 1) {
			int j = 0;
			for (int i = front; i <= rear; i++) {
				valuesOfElements[j++] = valuesOfElements[i];
			}
			front = 0;
			rear = size - 1;

		}
		valuesOfElements[++rear] = t;
		size++;
	}

	// Method to retrieve element from the queue
	public T dequeue() {
		if (size == 0) {
			return null;
		}

		T newElement = valuesOfElements[front];
		valuesOfElements[front] = null;
		front++;
		size--;
		return newElement;

	}

	public static void main(String[] args) {

		// Inserting Integer datatype elements into queue
		MyQueue<Integer> q = new MyQueue(Integer.class, 4);
		q.enqueue(3);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(4);

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

		// Inserting String datatype elements into queue
		MyQueue<String> q1 = new MyQueue(String.class, 3);
		q1.enqueue("mitali");
		q1.enqueue("chivate");
		q1.enqueue("fnCallBack");

		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());

	}

}
