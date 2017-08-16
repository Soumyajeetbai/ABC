package som.workspace.com;

public class Semester8th extends Student implements Result {
	
	private String sub1, sub2;
	private Float mark1, mark2, grade1, grade2,credit1,credit2;

	public Semester8th (String name, int Usd, int reg) {
	super(reg,Usd,name);
	}
	@Override
	public void setMarks(float mark1,float mark2) {
	this.mark1=mark1;
	this.mark2=mark2;
	this.grade1=markToGrade(mark1);
	this.grade2=markToGrade(mark2);
	}
	@Override
	public float calculateGpa() {
	return (grade1* credit1+ grade2*credit2) / (credit1+credit2);
	}

	@Override
	public void getSubject() {
	sub1="Object oriented Design";
	sub2="Operating System";
	credit1=(float)3.0;
	credit2=(float)2.0;
	}

	@Override
	public void showResult() {
	System.out.println("\nName: " + name + "\n Usd = " + Usd + "\nRegistration no: " + reg + "\n" + sub1 + " grade: " + grade1+ "\n" + sub2 + " grade: " + grade2 + "\nGPA: " + calculateGpa());
	}

	public void display_info()
	{
		System.out.println("\nName: " + name + "\nUSD = " + Usd + "\nRegistration no: " + reg + "\n" + sub1 + " collage: " + collage);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
