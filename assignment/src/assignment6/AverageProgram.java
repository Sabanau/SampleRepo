package assignment6;

public class AverageProgram {

	public static void main(String[] args) {
		AverageProgram obj = new AverageProgram();
		System.out.println(obj.findAverage(10,10,10));
		System.out.println(obj.findAverage(10.01f,10.01f,10.01f));

	}
	double findAverage(int a, int b, int c) {
		return (a+b+c)/3;
	}
	float findAverage(float a, float b, float c) {
		return (a+b+c)/3;
	}

}
