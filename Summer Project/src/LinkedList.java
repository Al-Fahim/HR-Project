
public class LinkedList {
	
	private Node head;
	private Stack layoff;
	private queue rehire;
//------------------constructors
	public LinkedList() {
		head = new Node();
		layoff = new Stack();
		rehire = new queue();
	}

	public boolean isEmpty() {
		return head.next == null;
	}
//------------------Inserts in sorted order
	public void insertsort(Employee a) {
		Node current = head.next;
		Node previous = head;
		while((current!=null)&&(a.compareTo(current.data)>0)) {
			previous = current;
			current=current.next;
		}
		current = new Node(a,current);
		previous.next = current;
		layoff.push(a);
	}
//----------------makes node with "a" info unaccessible
	public void delete(Employee a) {
		Node current = head.next;
		Node previous = head;
		while(current != null){ //search LinkedList
			if(current.data.equals(a)) {
				previous.next = current.next;	
				}
			}
			previous = current;
			current=current.next;
		}
//----------------makes node with "a" info unaccessible and pops off stack and enQ into ReHire
	public void Layoff() {
		delete(layoff.peak());
		rehire.enQ(layoff.pop());
	}
//---------------- Insert into list, push into stack and deQ from ReHire
	public void Rehire() {
		insertsort(rehire.deQ());
	}
	
//----------------- returns true or false if "a" exists
	public boolean search(Employee a) {
		Node current = head.next;
		while(current != null){
			if(current.data.equals(a)) {
				return true;
			}
			current=current.next;
		}
		return false;
	}
	
	public String Output() {
		String s = "";
		Node current = head.next;
		while(current != null){
		s += "\n" + current.data.getfirst() + " " + current.data.getlast() + " " + current.data.getid() ;
		current = current.next;
		}
		return s;
	}
//---------------- will print out in this format
	public String toString() {
		String s= "";
		Node current = head.next;
		int count = 0;
		while(current != null){
		s += "=======================" + "\n"+ current.data + "\n"+ "=======================" + "\n";
		count++;
		current = current.next;
		}
		s+="Number of Active Employee's: " + count + "\n";
		return s;
	}
}
