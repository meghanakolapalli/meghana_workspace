package mypackage;

public class price {
	void discount(float p,float d )
	{
		float dicou=p-p*d/100;
		System.out.println(dicou);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		price obj=new price();
		obj.discount(90000, 1.5f);

	}

}
