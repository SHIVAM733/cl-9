// Java program for client application
import java.rmi.*;
import java.util.*;
public class ClientRequest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String answer,value="",s2="";
		System.out.println("Enter 2 strings");
		value = sc.next();
		s2 = sc.next();
		try
		{
			// lookup method to find reference of remote object
			Search access =
				(Search)Naming.lookup("rmi://localhost:1900"+"/server");
			answer = access.query(value,s2);
			System.out.println("Reply from server \nConcatinated sting is "+ answer);
		}
		catch(Exception ae)
		{
			System.out.println(ae);
		}
	}
}
