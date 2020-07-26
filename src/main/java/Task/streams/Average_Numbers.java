package Task.streams;
import java.util.*;
import java.util.stream.DoubleStream;


public class Average_Numbers {
	public static void main(String args[]) {
		List<Integer> dou=Arrays.asList(8,68,92,100,67,20,284);
		double avg=dou.stream().
		mapToInt(i->i).
		average().orElse(-1);
		System.out.println("Average of numbers is: "+avg);
		
	}

}
