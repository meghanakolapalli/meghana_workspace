package payrolls;
import java.util.*;
import java.util.stream.Stream;

public class generateNoex {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("cat","dog");
		List<String> l2 = Arrays.asList("tiger","lion");
		Stream<List<String>> fs= Stream.of(l1,l2);
		fs.flatMap((a)-->a.stream()).distinct().forEach(System.out::println);
				
		
		// TODO Auto-generated method stub

	}

}
