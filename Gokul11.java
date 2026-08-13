import java.util.Scanner;
class Gokul11
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner ad = new Scanner(System.in);
		System.out.println("enter a number :");
		a = ad.nextInt();
		b = ad.nextInt();
		
		System.out.println(a*b);
		ad.close();
	}
}