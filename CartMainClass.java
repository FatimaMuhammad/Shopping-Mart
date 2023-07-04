package Shoppingmart;
import java.util.Scanner;
public class CartMainClass {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
		CartClass<String> cs = new CartClass<>();
		CartClass<Integer> dc = new CartClass<>();
			buy<String> bs = new buy<>();
			buy<Integer> bi= new buy<>(); 
			buy<Double> bd = new buy<>();
			
			System.out.println("***************Hellow dear Customer to shopping mart  "
					              + "now you can place your order and get your");
			  dc.details();
			  dc.addtoCartlist(1);
			 // dc.addtoCartlist(2);
			 // dc.addtoCartlist(3);
			 // dc.addtoCartlist(4);
			 // dc.addtoCartlist(5);
			  dc.deleteFromCartList(2);
			  dc.findMissingOrder(3);
			  dc.deleteFromCartList(1);
			  dc.displayCartList();
               dc.RemoveAllCartList();
		}
	}


