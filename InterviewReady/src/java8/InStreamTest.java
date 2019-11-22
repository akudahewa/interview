package java8;

import java.util.stream.IntStream;

public class InStreamTest {
	
	public static void main(String args[]) {
		
		int[] nummbers = {4,2,6,7,3,9};
		IntStream.of(nummbers).min().ifPresent(min->{System.out.println(min);});
		
		IntStream.of(nummbers).distinct().sorted()
		.limit(3).forEach(num->{System.out.println(num);});
	}

}
