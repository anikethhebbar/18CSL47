import java.io.*;
import java.util.*;
public class Lab3b {
	String dd,mm,yyyy;
	public void rd(String n, String d)
	{
		StringTokenizer token =new StringTokenizer(d,"/");
		dd= token.nextToken();
		mm=token.nextToken();
		yyyy=token.nextToken();
		System.out.println(n+"  DOB IS- "+dd+","+mm+","+yyyy+".");
	}
	public static void main(String args[]){
		var sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter dob in dd/mm/yyyy: ");
		String date=sc.next();
		Lab3b d = new dateofb();
		d.rd(name, date);
	
	}

}
