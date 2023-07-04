package Shoppingmart;
import java.util.Scanner;
public class MainCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Scanner sc= new Scanner (System.in);
		System.out.println("\t\t\t\t\t\t Welcome to shopping mart "
			                    	+ "here  you can grab your products"
				           +"on the basis of first come first serve\t\t\t\t");
		
		System.out.println("enter the size of your queue" );
		int size= sc.nextInt();
		Customer<Integer> cd = new Customer<>(size);
		Customer<String> sd=  new Customer<> (size);
		
		System.out.println("*********Add Coustomer Details**********"); 
		cd.AddCustomer(01);
		//cd.AddCustomer(02);
		//cd.AddCustomer(03);
		//cd.AddCustomer(04);
		cd.QueueIsEmpty();
	    cd.QueueIsFull();
        cd.ShowAllCustomer();
        cd.deleteCustomer();
	    sd.Customercheckout();
	    cd.AddCustomer(05);
	    cd.Customercheckout();
	}

	public static void executeQueryforUpdate(String string) {
		// TODO Auto-generated method stub
		
	}
	}


