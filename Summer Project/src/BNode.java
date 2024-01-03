
public class BNode {
	protected Employee data;
	protected BNode left;
	protected BNode right;
///--------------------------------------------------------- Constructors
	public BNode() {
		data=null;
		left=null;
		right=null;
	}
	public BNode(Employee a) {
		data = a;
		left=null;
		right=null;
	}
	public BNode(Employee a, BNode left, BNode right) {
		data = a;
		this.left = left;
		this.right = right;
	}
///--------------------------------------------------------- sets and gets
	public void setData(Employee a) {
		this.data=a;
	}
	public void setLeft(BNode left) {
		this.left=left;
	}
	public void setRight(BNode right) {
		this.right=right;
	}
	public Employee getData() {
		return this.data;
	}
	public BNode getLeft() {
		return this.left;
	}
	public BNode getright() {
		return this.right;
	}

}
