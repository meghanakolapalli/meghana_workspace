package payrolls;
import java.io.*;
public class AccountRecords {
	public void WriteToFile(Customer obj)
	{
		try{
			FileOutputStream fout=new FileOutputStream("C://Users//KOMEGHAN//Desktop//Hello.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(obj);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
			
	}
	public void readFromFile()
	{
		try{
			FileInputStream fin=new FileInputStream("C://Users//KOMEGHAN//Desktop//Hello.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			Customer customer=(Customer)objin.readObject();
			customer.showDetails();
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
			
		}
	public static void main(String[] args){
		Customer c=new Customer("pooja","banglore");
		AccountRecords r= new AccountRecords();
		r.WriteToFile(c);
		r.readFromFile();
	}
	}
			