package som.workspace.com;
import java.util.*;
public class Student1 {
  int noOfStudent;
 static int noOfExaminations;
 static {
	 noOfExaminations=3;
 }
 public Student1(int n){
	 noOfStudent=n;
 }
 public double average(double sum){
	 double avg=sum/3;
	 return avg;
	 
 }
 public static void main(String[] args)throws Exception {
	Scanner in =new Scanner(System.in);
	System.out.println("Please enter the number of students:");
	int n1=in.nextInt();
	//System.out.println("Please enter the number of subjects they have:");
	//int n2=in.nextInt();
	Student1 st=new Student1(n1);
	int [][] stu=new int[n1][Student1.noOfExaminations];
	int sum=0;
	int abc;
	for(int i=1;i<=stu.length;i++){
		for(int j=1;j<=stu[i].length;j++){
			System.out.println("Enter the marks of "+i+" Student "+j+" Examination");
			stu[i][j]=in.nextInt();	
	}
	}
	for(int a=0;a<=stu.length;a++){
		for(int b=1;b<=stu[a].length;b++){
			sum=sum+stu[a][b];
		}
		abc=(int)st.average(sum);
		if(abc>=50){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
	}
	
	in.close();

}
}

