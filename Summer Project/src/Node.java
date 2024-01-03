
public class Node {
	protected Employee data;
	protected Node next;
///--------------------------------------------------------- Constructors
	public Node() {
		data=null;
		next=null;
	}
	public Node(Employee a) {
		data = a;
		next = null;
	}
	public Node(Employee a, Node next) {
		data = a;
		this.next = next;
	}
///--------------------------------------------------------- sets and gets
	public void setData(Employee a) {
		this.data=a;
	}
	public void setNext(Node next) {
		this.next=next;
	}
	public Employee getData() {
		return this.data;
	}
	public Node getNext() {
		return this.next;
	}
}
