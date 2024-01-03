
public class BST {
	private BNode root;
	
	public BST() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root.left == null && root.right == null ;
	}
	
	//Insertion to the Tree
	public void BSTInsert(Employee a) {
		root = BSTInsert(root,a);	
	}
	private static BNode BSTInsert(BNode t, Employee a) {
		if (t  == null) t = new BNode(a);
			else { 
				if(a.compareTo(t.data) < 0) {
					t.left = BSTInsert(t.left,a);
				}
			    else t.right = BSTInsert(t.right, a);
			}
		return t;
	}
	
	//Searching the tree
	public boolean BSTSearch(Employee x){
		return BSTSearch(root,x);
		}

	private static boolean BSTSearch(BNode t, Employee x) {
		if (t  != null) 
		{
		    if (x.compareTo(t.data) < 0) 
		           return BSTSearch (t.left,x);
		    else if (x.compareTo(t.data) > 0) 
		           return BSTSearch (t.right, x);
		    else return true;
		    }
		else return false;
	} 
	
	//Delete a Node from the Tree
	public void BSTDelete(Employee x){ 
		root =BSTDelete(root,x);
		}

	private static BNode BSTDelete(BNode t, Employee x) { 
		if (t  != null)  //search for node
		{
		    if (x.compareTo(t.data) < 0) 
		           t = BSTDelete (t.left,x);
		    else if (x.compareTo(t.data) > 0) 
		           t = BSTDelete (t.right, x);
		    else return null;
		    }
		
		if(t.right == null && t.left == null) { //checks if leaf
				return t;
		}
		
		if(t.left == null) { 
			if(t.right != null) { //checks if right is not null
				return t.right;
			}
		}else if (t.right == null) {
			if(t.left != null) { //checks if left is not null
				return t.left;
			}
		}
		if(t.right != null && t.left != null) { //checks if node has 2 children
			BNode suc = t.right;
			while (suc.left != null) { //finds left most of right tree
	               suc = suc.left;
			}
	               BNode sucdata = suc; //grabs the data 
	               BSTDelete(suc,suc.data); //deletes it
	               t = sucdata; //t is now the new data
		}
		
		return null;
	}
	
	//Find Minimum Node 
	public Employee FindMin() {
		if (root == null) return null;
		BNode t = root;
		while (t.left != null) t = t.left;
		return t.data;

	}
	
	//Find Maximum Node 
		public Employee FindMax() {
			if (root == null) return null;
			BNode t = root;
			while (t.right != null) t = t.right;
			return t.data;

		}
	//String output
		public String toString() {
			return toString(this.root) ;
		}
		private String toString(BNode root) { //pre-order traversal
			if(root == null) {
				return "";
			}
			String s = "";
			s += "\n"+ root.data;
			s += toString(root.left);
			s += toString(root.right);		
			return s;
		}
   //To put into text file
		public String Output() {
			return Output(this.root) ;
		}
		private String Output(BNode root) {
			if(root==null) {
				return "";
			}
			String s = "";
			s += "\n"+ root.data.getfirst()+ " "+ root.data.getlast()+ " " + root.data.getid();
			s += Output(root.left);
			s += Output(root.right);	
			return s;
		}
}
