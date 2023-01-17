package poly;

public class stringbb {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder();
		s1.append("hello people ! this is a StringBuilder text");
		System.out.println(s1);
		s1.insert(13,"welcome");
		System.out.println(s1);
		s1.replace(6, 12, "programer");
		System.out.println(s1);
		s1.delete(34, 48 );
		System.out.println(s1);
		s1.insert(35, "StringBuffer");
		System.out.println(s1);
		
		
		
	
		// TODO Auto-generated method stub

	}

}
