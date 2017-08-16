package som.workspace.com;

public class B extends A {
	
	public void disp()
	{
		 
		System.out.println("B class ");
	}
	
	public void show()

	{
		this.disp();
		super.disp();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj=new B();
		//obj.disp();
		obj.show();

	}

}
