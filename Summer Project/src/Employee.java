
public class Employee {

	private  String last;
	private  String first;
	private  String id;
////----------------------------------------------------------------------------------------////////// contructors 	
	public Employee() {
	
	}
	
	public Employee(String first,String last, String id){
		setlast(last);
		setfirst(first);
		setid(id);
	}
////----------------------------------------------------------------------------------------////////// gets & sets last	
	public String getlast() {
		return last;
	}
	
	public void setlast(String last) {
		this.last = last;
	}
////----------------------------------------------------------------------------------------////////// gets & sets first			
	public String getfirst() {
		return first;
	}
	
	public void setfirst(String first) {
		this.first = first;
	}
////----------------------------------------------------------------------------------------////////// gets & sets id		
	public String getid() {
		return id;
	}
	
	public void setid(String id) {
		this.id = id;
	}
////----------------------------------------------------------------------------------------////////// makes a format
	public String toString() {
		return "First name:" + this.first + "\n" + "Last name:" + this.last + "\n" + "Id:" + this.id + "\n";
	}
////----------------------------------------------------------------------------------------////////// equals
	public boolean equals(Employee a){
		if (id.equals(a.id)) return true;
		return false;
		
	}
////----------------------------------------------------------------------------------------////////// compareTo is comparing last names then first name and will output true or false
	public int compareTo(Employee a){
		int value = last.compareTo(a.last);
		if(value==0) {
			value = first.compareTo(a.first);	
		}
		return value;		
	}
}