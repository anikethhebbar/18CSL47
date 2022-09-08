import java.util.*;
import java.io.*;
public class Floyds {
	public static void main(String args[])
	{
		
		int a[][]= new int[10][10],i,j;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes: ");
		int n= sc.nextInt();
		System.out.println("Enter the adjacency matrix: ");
		for(i=1; i<=n;i++)
			for(j=1;j<=n;j++)
				a[i][j]= sc.nextInt();	
		System.out.println("Entered matrix is :");
		for(i=1; i<=n;i++) {
			for(j=1;j<=n;j++)
				System.out.print(a[i][j]+"\t");
			System.out.println();
		}	
		floyds(a,n);
		System.out.println("All pair shortest path matrix:");
		for (i=1; i<=n; i++)
		{
			for (j=1; j<=n; j++)
				System.out.print(a[i][j]+"\t");
			System.out.println();
		}
	}
	static void floyds(int a[][],int n)
	{
		for (int k=1;k<=n;k++) {      	
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++)
				
					a[i][j]=min(a[i][j],a[i][k]+a[k][j]);
			}
		}
	}
	static int min(int a, int b)
	{
		if(a>b) return b;
		else return a;
	}
}
