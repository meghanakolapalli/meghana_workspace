package poly;

public class candiate {
	public void  checkmarks(int marks) throws Exception
	{
		if(marks<30){
			throw new Exception("marks invalid");
		}
		else{
		System.out.println("vaild marks");
		}
	}
	public static void main(String[] args) {
		candiate m=new candiate();
		try{
			m.checkmarks(20);
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	

}
