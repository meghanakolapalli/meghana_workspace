package payrolls;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class sort {

	public static void main(String[] args) {
		List<student> studentName=new ArrayList<>();
		studentName.add(new student("samil",20));
		studentName.add(new student("nikki",50));
		studentName.add(new student("pooja",70));
		studentName.add(new student("maggi",90));
		studentName.add(new student("rajan",40));
		studentName.add(new student("sreeja",70));
		
		Stream<student>studentStream=studentName.stream();
		Comparator<student> c = c=(a,b)->
		
		// TODO Auto-generated method stub

	}

}
