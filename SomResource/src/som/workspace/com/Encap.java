package som.workspace.com;

public class Encap {

	  
	public int rollno;
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String name;//String type 
	
	//accessing //getter //setter 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encap obj=new Encap();
		
		
		
	obj.setRollno(102);
	obj.setName("sameer");
	System.out.println(obj.getName());
	System.out.println(obj.getRollno());

	}

}
