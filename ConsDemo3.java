
public class ConsDemo3 
{
int a=10;
	ConsDemo3()
	{
		System.out.println("Cons of ConsDemo1");
		a=15;
	}

	public static void main(String[] args) 
	{
		System.out.println("Main method of ConsDemo1");
		ConsDemo3 c=new ConsDemo3();
		System.out.println(c.a);
		System.out.println("Done");

	}

}
