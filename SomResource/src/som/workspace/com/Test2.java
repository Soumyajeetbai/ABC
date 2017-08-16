package som.workspace.com;

public class Test2 {
	
	
	public double l,b;
      public void react(double l, double b)
      {
    	  this.l=l;
    	  this.b=b;
    	  
    	
      }
      
      public double area()
      {
    	  return l*b;
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 obj=new Test2();
		obj.react(5, 7);
		System.out.println("The area of the reactangle is " +obj.area());
		
		

	}

}
