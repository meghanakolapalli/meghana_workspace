package mypackage;
import java.io.*;

public class sample {

	public static void main(String[] args) {
		File f=new File("C://Users//KOMEGHAN//Desktop");
		File[] flist=f.listFiles();
		for(File file:flist)
		{
			System.out.println(file.getName());
			if(file.isFile())
			{
				System.out.println("is a file");
			}
			if(file.isDirectory())
			{
				System.out.println("is a directory");
			}
			
		}
		// TODO Auto-generated method stub

	}

}
