package som.workspace.com;

public class Parent {
	
	
	private void method1(){
      	System.out.println ("Parent's method1()");
	}  
	public void method2() {
	    System.out.println ("Parent's method2()");
	method1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
