package assignment6;

public class StudentGrade {
	
	int mark1, mark2, mark3;
	
	StudentGrade(int m1, int m2, int m3){
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
	}

	public static void main(String[] args) {
		StudentGrade student1 = new StudentGrade(90,90,90);
		StudentGrade student2 = new StudentGrade(50,50,55);
		
		int tot1 = student1.getTotalMark();
		int tot2 = student2.getTotalMark();
		
		System.out.println("Student1 Mark Scored "+tot1+" Grade "+student1.getGrade(tot1));
		System.out.println("Student2 Mark Scored "+tot2+" Grade "+student2.getGrade(tot2));

	}
	
	int getTotalMark( ){
		int totalMark = mark1+mark2+mark3;
		return totalMark;
	}
	
	String getGrade(int total) {
		if (total > 250 && total <= 300) {
            return "A";
        } else if (total > 200 && total <= 250) {
            return "B";
        } else if (total >= 150 && total <= 200) {
            return "C";
        } else if (total >= 125 ) {
            return "D";
        } else {
            return "Fail";
        }	
	
	}

}
