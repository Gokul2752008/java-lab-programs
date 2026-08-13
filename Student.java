class Gokul11
{
	int rollno;
	String name;
	double marks;
	
	void display()
	{
		System.out.println("Roll no :" + rollno + " Name : " + name ); 
	}
}	
	 class Test
	{
		public static void main (String[] args)
		{
		  Gokul11 s1 = new Gokul11();
		  s1.rollno = 62;
		  s1.name = "Gokul";
		  s1.marks = 93.45;
		  s1.display();
		}
	}