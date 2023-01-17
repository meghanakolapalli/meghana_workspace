package payrolls;
import java.io.*;




public class Customer implements Serializable{
		String customerName;
		String address;
		public Customer(String customerName, String address){
			this.customerName=customerName;
			this.address=address;
		}
		public void showDetails()
		{
			System.out.println("Customer Name "+customerName);
			System.out.println("Address "+address);
		}
		

}
