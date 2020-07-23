package uday;
import java.util.*;
import java.util.stream.IntStream;
public class Palindrome {
	private static Scanner in;
	public static List<String> palindrome(List<String> str_list)
	{
		List<String> palstrings=new ArrayList<String>();
		for(String str:str_list)
		{
			String temp=str.replaceAll("\\s+","").toLowerCase();
			if(IntStream.range(0, temp.length() / 2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1)))
				palstrings.add(temp);
		}
		return palstrings;
	}
	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		System.out.println("Enter number of Strings to be in List:");
		int n=in.nextInt();
		List<String> str_list=new ArrayList<String>();
		String s;
		for(int i=0;i<n;i++)
		{
			s=in.next();
			str_list.add(s);
		}
		System.out.println("Palindromic List of Strings:");
		System.out.println(palindrome(str_list));
	}

}
