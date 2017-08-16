package som.workspace.com;

public class A {
	
    public int length;
    public int breadth;
    
    public void react(int length,int breadth)
    {
    	this.length=length;
    	this.breadth=breadth;
    }
    public int area()
    {
    	return length*breadth;
    }
	
    
    public static void main(String[] args) {
		
    	
    	A obj=new A();
    	obj.react(7, 6);
    	
    	System.out.println("The area of the reactangle is " +obj.area());
	}

}
