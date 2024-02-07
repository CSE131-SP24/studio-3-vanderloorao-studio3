package studio3;
import java.util.Scanner;

public class Sieve {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Which number would you like to find all of the primes up to? ");
		int n = in.nextInt();
		int [] array = new int[n-1];
		for(int i=0; i<array.length;i++)
		{
			array[i] = i+2;
		}
		for(int i=2; i<array.length;i++)
		{
			for(int j=0; j<array.length; j++)
			{
				if(array[i-2] ==((i*i) + (j*i)))
				{
					array[i-2] = 0;
				}
			}
		}
		for(int i=0; i<array.length; i++)
		{
			if(array[i] != 0) {
				System.out.println(array[i] + "");
			}
		}
	}

	{

	}

}
