package som.workspace.com;

class Str2{  
	 int rollno;  
	 String name;  
	 String city;  
	  
	 Str2(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	  
	 public static void main(String args[]){  
	   Str2 s1=new Str2(101,"Raj","lucknow");  
	   Str2 s2=new Str2(102,"som","bangalore");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 }  
	}  