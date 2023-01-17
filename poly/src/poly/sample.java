package poly;

public class sample {
	

	public void addnumbers(int size)
	{
		
		int[] a={12,13,14,15,45};
		try{
		
		for(int i=0; i<size; i++);
		{
	
			System.out.println( "array element" +a[i]);
		}
		}catch(Exception e){
			System.out.println("index less then 4");
		}
	}

	public static void main(String[] args) {
		sample s=new sample();
		s.addnumbers(3);

	}

}
