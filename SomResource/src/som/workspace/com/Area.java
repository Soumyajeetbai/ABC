package som.workspace.com;

public class Area {
	
	double length,breath;//Area of a reactangle l*b instance variable 
	
	
	public void react(double length,double breadth)//methods react
	{
		this.length=length;//compiler get confused. 
		this.breath=breadth;
		//this ?
		
		
	}
	
	double area()
	{
		return this.length*this.breath;
	}

	static public final synchronized strictfp  void main(String ... Som) {
		// TODO Auto-generated method stub
		
		Area obj=new Area();
		obj.react(6.4, 4.5);
		System.out.println("The area of a reactangle is " +obj.area());

	}

}
