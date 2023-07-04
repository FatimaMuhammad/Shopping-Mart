package Shoppingmart;
import java.util.Scanner;

public class CartClass<E> {

		buy head;
		
		 public String orderName;
	     public int orderNo;
	     public String oerderId;
	     public int orderQuantity;
	     public double  orderPrice;
	     public String orderQuality;
	     
		public String getOrderName()
		 {
			return orderName;
		  }
		public void setOrderName(String orderName) {
			this.orderName = orderName;
		}
		public int getOrderNo() {
			return orderNo;
		}
		public void setOrderNo(int orderNo) {
			this.orderNo = orderNo;
		}
		public String getOerderId() {
			return oerderId;
		}
		public void setOerderId(String oerderId) {
			this.oerderId = oerderId;
		}
		public int getOrderQuantity() {
			return orderQuantity;
		}
		public void setOrderQuantity(int orderQuantity) {
			this.orderQuantity = orderQuantity;
		}
		public double getOrderPrice() {
			return orderPrice;
		}
		public void setOrderPrice(double orderPrice) {
			this.orderPrice = orderPrice;
		}
		public String getOrderQuality() {
			return orderQuality;
		}
		public void setOrderQuality(String orderQuality) {
			this.orderQuality = orderQuality;
		}
		Scanner sc = new Scanner(System.in);
		
		public void details() 
		{
			System.out.println("*********Add Coustomer Details**********");
			System.out.println("Add OrderName");
			    this.setOrderName(sc.next());
			System.out.println("Add OrderNo");  
			   this.setOrderNo(sc.nextInt());
			System.out.println("Add OrderId");
				this.setOerderId(sc.next());
			System.out.println("Add OrderQunatity");
		        this.setOrderQuantity(sc.nextInt());
		     System.out.println("Add OrderPrice");
		       this.setOrderPrice(sc.nextInt());
		     System.out.println("Add OrderQuality");
		         this.setOrderQuality(sc.next());
		     System.out.println(this.getOrderName()+ this.getOrderNo()+
		    		 this.getOerderId()+this.getOrderQuantity()
		    		 +this.getOrderPrice() +this.getOrderQuality());
		   }
	    
		public void addtoCartlist(E value)
		{
			buy newNode=new  buy();
			newNode.data=value;
			newNode.next=null;
			
			if(head==null)
			{
				head=newNode;
				System.out.println("***********Yes! You Can Add To"
						+ " Your Order In Cartlist********** ");
			this.details();
			}
			else
			{
				buy CartNode=head;
				while(CartNode.next!=null) //updating value
				{
					CartNode=CartNode.next;
				}
				CartNode.next=newNode;
				
				System.out.println("********* Your Cart Is Updated "
						+ "Now You Can Add Your Order*******");
				this.details();
			}
		}	
		
		public void displayCartList()
			{
				buy CartNode=head;
				while(CartNode!=null)
				{
					System.out.println(CartNode.data);
					System.out.println("*******your cartlist has been display"
							+ "now you can see your orderList/ Cartlist*******");
					CartNode=CartNode.next;
			}
					
		}
			public void deleteFromCartList(E value)
			{
				if(head.data==value)
				{
					head=head.next;
					System.out.println("******Your Order Has Been Dispatch "
							+ "Now Kindly Wait For Recieving Your Parcel/Order******  ");
					}
				else
				{
					buy buynode=head;
					buy cart=head;	
				System.out.println("*******Cartlist is Updated "
						+ "Now Your Order is Dispatch****** ");
				}
			}
	   public void RemoveAllCartList () {
		 head=null;
		System.out.println("******CONGRATULATIONS! "
				+ "You Accomplishded Your Todays Mission******* ");		
				}
	
	  public boolean findMissingOrder(E value) 
	    {
		   buy buynode=head;
		   while(buynode!=null)
		   {
			  if (buynode.data==value)
			  {
				System.out.println("*********Here Is Your Missing Order Congratulation!"
						+ " You Have Found Miss One +\t********");
			
				return true;
			 }
			buynode = buynode.next;
		   }
			System.out.println("******* Your Order is Missed"
					+ " Wrote Application  For  Price Refund******* ");
			return false;
		   }
	

}

	
	
	
	
	
	
	
	
	
	
	