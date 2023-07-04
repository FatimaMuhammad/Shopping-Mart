package Shoppingmart;
import java.util.Scanner;


public class Customer<E> {

	private String CustomerName;
	private String CustomerAddress;
	private int CustomerPhoneNO;
    private int  Customerid;
    
	
	public String getCustomerName() {
		return CustomerName;
	}


	public void setCustomerName(String customerName) {
		this.CustomerName = customerName;
	}


	public String getCustomerAddress() {
		return CustomerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.CustomerAddress = customerAddress;
	}


	public int getCustomerPhoneNO() {
		return CustomerPhoneNO;
	}


	public void setCustomerPhoneNO(int customerPhoneNO) {
		this.CustomerPhoneNO = customerPhoneNO;
	}


	public int getCustomerid() {
		return Customerid;
	}


	public void setCustomerid(int customerid) {
		this.Customerid = customerid;
	}
	
	Customer () {
		
	}
	E queue[];
	int size,filledstatus=0;
	
	@SuppressWarnings("unchecked")
	Customer(int size)
	{
		this.size=size;
		queue=(E[]) new Object[size];
	}
	
	Scanner sc= new Scanner (System.in);
	
	public Customer<buy> AddCustomer(E value)
	{
		queue[filledstatus]=value;
		filledstatus++;
		
		System.out.println("********Customer  has  been added successfully*********" +value);
		this.details();
		return null;
			
	
	}
	public void details() 
	{
		System.out.println("*********Add Coustomer Details**********");
		System.out.println("Add Coustomer Name");
		this.setCustomerName(sc.next());
		System.out.println("Add Coustomer Address");  
		    this.setCustomerAddress(sc.next());
		    System.out.println("Add Coustomer id");
			this.setCustomerid(sc.nextInt());
		System.out.println("Add Coustomer PhoneNo");
	this.setCustomerPhoneNO(sc.nextInt());
	System.out.println(this.getCustomerName()+  this.getCustomerid()+ this.getCustomerAddress()+  this.getCustomerPhoneNO());
	}
	
	public void ShowAllCustomer()
	{
		for(int i=0;i<filledstatus;i++)
		{
			System.out.println("*********List of the cstomners*********" +queue[i]);
			//System.out.println(queue[i]);
		}
	}
	
	public void deleteCustomer()
	{
		filledstatus--;
		for(int i=0;i<filledstatus;i++)
		{
			queue[i]=queue[i+1];
			System.out.println("*********Customer  has beeen deleted successfully*******" +queue[i]);
		}
	}
	
	public boolean QueueIsEmpty () {
		if(size==0)
		{
			System.out.println("*******There  is No customer left******");
			return true;	
		}
		else {
			 System.out.println("********Customer is in the queue********");
			return false;
	    }
	}
	 public boolean QueueIsFull() {
		 if (size==queue.length) {
			 
			System.out.println("********Waiting For Your Turn Be Patience******");
		 return true;
		 }
		 else
		 {
			 System.out.println("********Welcome To Your Turn********");
	     return false;
	     }
	
	 }
	
	 public  void  Customercheckout() {
		 Customer cu = this;
         MainCustomer.executeQueryforUpdate("INSERT INTO Customer ( CustomerId, CustomerName,CustomerAddress, CustomerPhoneNO) VALUES ('"
                 +cu.getCustomerName()+"','"+cu.getCustomerPhoneNO()+"','"+cu.getCustomerid()+"','"+cu.getCustomerAddress());


}

}