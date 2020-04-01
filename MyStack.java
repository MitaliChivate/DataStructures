//A Generic Class which represents Stack Data Structure 
public class MyStack<T> {
	int size; // variable holding the size of of stack
	StackElement<T> top; // variable representing top most element in Stack

	public MyStack() {
		// TODO Auto-generated constructor stub
		size = 0;
		top = null;
	}

	// method for inserting the elements into stack
	public void push(T newValue) {
		StackElement<T> newElement = new StackElement<T>(newValue, top);
		top = newElement;
		size++;

	}

	// method for retrieving the elements inserted into stack
	public T pop() {
		StackElement<T> oldTop = top;
		if (size == 0) {
			return null;
		}
		top = top.getNext();
		size--;
		return oldTop.getValue();
	}

	public static void main(String[] args) {
		// inserting String datatype into Stack

		MyStack<String> myStringStack = new MyStack<String>();
		myStringStack.push("Mitali");
		myStringStack.push("Chivate");
		myStringStack.push("FnCallBack");

		System.out.println(myStringStack.pop());
		System.out.println(myStringStack.pop());
		System.out.println(myStringStack.pop());

		// inserting Integer datatype into Stack
		MyStack<Integer> myIntegerStack = new MyStack<Integer>();
		myIntegerStack.push(1);
		myIntegerStack.push(2);
		myIntegerStack.push(3);

		System.out.println(myIntegerStack.pop());
		System.out.println(myIntegerStack.pop());
		System.out.println(myIntegerStack.pop());

	}

}
