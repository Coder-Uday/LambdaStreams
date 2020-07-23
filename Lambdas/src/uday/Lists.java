package uday;
import java.util.*;
import java.util.stream.Collectors;
public class Lists {
	private static Scanner in;
	public static List<String> search(List<String> string_list)
	{
		return string_list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
	}
	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		System.out.println("Enter number of strings to be inserted");
		int n=in.nextInt();
		List<String> string_list=new ArrayList<String>();
		String str;
		for(int i=0;i<n;i++)
		{
			str=in.next();
			string_list.add(str);
		}
		System.out.println("List :");
		System.out.println(string_list);
		System.out.println("Resultant List of Strings:");
		System.out.println(search(string_list));
	}


}
