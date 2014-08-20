package chocolate_feast;

import java.util.Scanner;

public class ChocolateFeast 
{
	public static int chocolates(int n, int c, int m) 
	{
		int choco = n /c;
		int temp = choco;
		while(temp >= m)
		{
			choco++;
			temp = temp - m;
			temp++;
		}
		return choco;	
	}
	public static void main(String args[]) 
	{
		Scanner sr = new Scanner(System.in);
		int count = Integer.parseInt(sr.nextLine());
		int n[] = new int[count];
		int c[] = new int[count];
		int m[] = new int[count];
		for(int i = 0; i < count; i++)
		{
			n[i]  = Integer.parseInt(sr.next());
			c[i]  = Integer.parseInt(sr.next());
			m[i]  = Integer.parseInt(sr.next());
		}
		for(int i = 0; i < count; i++)
		{
			System.out.println(chocolates(n[i],c[i],m[i]));
		}
		sr.close();
	}
}
