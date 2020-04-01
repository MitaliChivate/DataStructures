// A class in the form of linked list for implementation of stack 
public class StackElement<T> {
	T value; // variable that holds the value of new element inserted
	StackElement<T> next; // variable that remembers the old top element to maintain the sequence

	public StackElement(T value, StackElement<T> next) {

		this.value = value;
		this.next = next;
	}

	// Getter Methods
	public StackElement<T> getNext() {
		return next;
	}

	public T getValue() {
		return value;
	}

}
 