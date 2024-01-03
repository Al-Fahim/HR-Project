
public class Stack {
	private int size;
	private Employee[] data;
	private int top = -1;
	
	public Stack() {
		size = 10;
		data = new Employee[size];
	}
	
	public boolean isEmpty() {
		return top ==-1;
	}
	
	public void push(Employee a) {
		if(top < data.length)data[++top] = a;

	}
	
	public Employee pop() {
		// if(isEmpty())return data[top]--;
		return data[top--];
	}
	
	public Employee peak() {
		// if(isEmpty()) return data[top];
		return data[top];
	}
	public String toString() {
		String s = "";
		for(int i = data.length -1; i > -1 ;i--) {
			s += data[i] + "\n";
		}
		return s;
	}
}
