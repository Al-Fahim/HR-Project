import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		BST HRlist = new BST();
		Stack layoff = new Stack();
		queue rehire = new queue();
		
			char option='\0';
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			 
				
				do {
				File inputFile = new File("active.txt");
				File inputfile = new File("rehire.txt");
				Scanner in = new Scanner(inputFile);
				Scanner in2 = new Scanner(inputfile);
				while(in.hasNextLine()) {
					String a = in.next();
					String b = in.next();
					String c = in.next();
					Employee person = new Employee(a,b,c);
					HRlist.BSTInsert(person);
					layoff.push(person);
				}
				while(in2.hasNextLine()) {
					String a = in.next();
					String b = in.next();
					String c = in.next();
					Employee person = new Employee(a,b,c);
					rehire.enQ(person);
				}
				in.close();
				in2.close();
				System.out.println("Enter a Option");
				System.out.println("=======================");
				System.out.println("Press 1 to Add a Name " + "\n" + "Press 2 to Print List " + "\n" +"Press 3 to Search for Employee" + "\n" + "Press 4 to Layoff Recent Employee" + "\n" + "Press 5 to Rehire Oldest Employee" + "\n" + "Press 6 to Quit");
				System.out.println("=======================");
				option = scan.nextLine().charAt(0);
				System.out.println("\n");
				
				switch(option) {
				
				case '1': //add
					
					System.out.println("=======================" + "\n" +"Write a first name: "); 
					String first = scan.nextLine(); 
					
					System.out.println("=======================" + "\n" + "Write a last name: "); 
					String last = scan.nextLine(); 
					
					System.out.println("=======================" + "\n" +"Write a Id: ");
					String Id = scan.nextLine(); 
				
					Employee input = new Employee(first,last,Id);
					HRlist.BSTInsert(input);
					layoff.push(input);
					break;
				
				case '2': //display
					System.out.println(HRlist);
					break;
					
				case '3': //search
					System.out.println("=======================" + "\n" +" Write First Name: ");
					String firstsearch = scan.nextLine(); 
					
					System.out.println("=======================" + "\n" + "Write a last name: "); 
					String lastsearch = scan.nextLine(); 
					
					System.out.println("=======================" + "\n" +"Write a Id: ");
					String Idsearch = scan.nextLine(); 
					
					Employee temp1 = new Employee(firstsearch,lastsearch,Idsearch);
					if(HRlist.BSTSearch(temp1)==false) {
						System.out.println("This Person Does Not Exist In Our System");
					}else if (HRlist.BSTSearch(temp1)==true) System.out.println("This Person Is A Employee");
					break;
					
				case '4': //delete
					HRlist.BSTDelete(layoff.peak());
					rehire.enQ(layoff.pop());
					System.out.println("=======================" +  "\n" + "Employee Has Been Removed" + "\n" + "=======================" + "\n" );
					break;
					
				case '5': //re hire
					HRlist.BSTInsert(rehire.deQ());
					System.out.println("=======================" +  "\n" + "Employee Has Been Rehired" + "\n" + "=======================" + "\n" );
					break;
					
				case '6': //quit
					System.out.println("=======================");
					System.out.println("Exit");
					System.out.println("=======================");
					PrintWriter out = new PrintWriter(inputFile);
					PrintWriter out2 = new PrintWriter("rehire.txt");
					out.print(HRlist.Output());
					out2.print(rehire);
					out.close();
					out2.close();
					break;
				
				default:
					System.out.println("=======================" +  "\n" + "Not an Option, Try Again" + "\n" + "=======================" + "\n" );
					break;
				} 
				}while(option != '6');
				System.out.println("Done"); 
		
		
		
	}
	}
