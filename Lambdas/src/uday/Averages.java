package uday;
import java.util.*;
public class Averages {
	private static Scanner in;
	public static double Average(List<Integer> array_list)
	{
		return array_list.stream().mapToInt(ele -> ele).average().getAsDouble();
	}
	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		System.out.println("Enter the number of integers");
		int no=in.nextInt(),x;
		List<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<no;i++)
		{
			x=in.nextInt();
			a.add(x);
		}
		System.out.println("Stream of ntegers:");
		System.out.print(a);
		System.out.println();
		System.out.println("Average of the Integers Stream is: "+Average(a));
	}

}
