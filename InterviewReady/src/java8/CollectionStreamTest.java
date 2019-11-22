package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionStreamTest {
	
	static List < Integer > myList = new ArrayList < > ();
	
	public static void main(String args[]) {
//		List<Integer> list = new ArrayList<>();
//		for(int i=0;i<100;i++)
//			list.add(i);
//		
//		List<Integer> items=list.stream().filter(x->x%2==1).collect(Collectors.toList());
//		
//		
//		list.stream().filter(x->x%2==1).collect(Collectors.toList())
//			.forEach(x->System.out.println(x));
		
		  for (int i = 0; i < 5000000; i++)

			   myList.add(i);

			  int result = 0;

			  long loopStartTime = System.currentTimeMillis();

			  for (int i: myList) {

			   if (i % 2 == 0)

			    result += i;

			  }

			  long loopEndTime = System.currentTimeMillis();

			  System.out.println(result);

			  System.out.println("Loop total Time = " + (loopEndTime - loopStartTime));

			  long streamStartTime = System.currentTimeMillis();

			  System.out.println(myList.stream().filter(value -> value % 2 == 0).mapToInt(Integer::intValue).sum());

			  long streamEndTime = System.currentTimeMillis();

			  System.out.println("Stream total Time = " + (streamEndTime - streamStartTime));

			  long parallelStreamStartTime = System.currentTimeMillis();

			  System.out.println(myList.parallelStream().filter(value -> value % 2 == 0).mapToInt(Integer::intValue).sum());

			  long parallelStreamEndTime = System.currentTimeMillis();

			  System.out.println("Parallel Stream total Time = " + (parallelStreamEndTime - parallelStreamStartTime));


		
	}

}
