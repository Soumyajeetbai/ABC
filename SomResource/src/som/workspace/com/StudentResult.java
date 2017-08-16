package som.workspace.com;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Semester7th std1 = new Semester7th ("Pushpa", 127, 149);
		std1.setMarks(60,70);
		System.out.println("Welcome to Student result processing System");
		System.out.println("\nEnter First Semester Student's Info:");
		std1.getSubject();
		std1.showResult();
		std1.display_info();

		Semester8th std2 = new Semester8th("Som", 227, 249);
		std2.setMarks(70,80);
		System.out.println("\n\nEnter Second Semester Student's Info:");
		std2.getSubject();
		std2.showResult();
		std2.display_info();

	}

}
