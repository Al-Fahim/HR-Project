
public class queue {
	
	private int arraysize;
	private Employee[] data;
	private int front = 0;
	private int rear = -1;
	
	public queue() {
		arraysize = 10;
		data = new Employee[arraysize];
	}
	
	public boolean isEmpty() {
		return rear ==-1;
	}
	
	public void enQ(Employee x) {
			rear = (rear + 1)% arraysize;
			data[rear]= x;
	}
	
	public Employee deQ() {
			front = front % arraysize;
			front++;
		return data[front];
	}
	
	public String toString() {
		String s = "";
		for(int i = front; i < rear ;i++) {
			s += data[i].getfirst() + " " + data[i].getlast()+ " " + data[i].getid();
		}
		return s;
	}
}
