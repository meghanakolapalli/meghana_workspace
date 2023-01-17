package mypackage;
import java.io.*;

public class inputoutput {

	public static void main(String[] args) {
		try{
			FileReader Reader= new FileReader("C://Users//KOMEGHAN//Desktop//Hello.txt");
			@SuppressWarnings("resource")
			BufferedReader buffer=new BufferedReader(Reader);
			String cstr;
			while ((cstr=buffer.readLine())!=null)
				System.out.println(cstr);

			
			
			}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
