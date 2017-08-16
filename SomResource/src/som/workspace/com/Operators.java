package som.workspace.com;

public class Operators{
	
	
	public int rollno;
	
	public Operators(int rollno)
	{
		this.rollno=rollno;
	}
	
	public void disp()
	{
		System.out.println("The roll no is " +rollno);
	}
	
	public static void main(String args[])
	{
		Operators anish=new Operators(1023);
		Operators som=new Operators(1024);
		anish.disp();
		som.disp();
		
		
	}
	
}