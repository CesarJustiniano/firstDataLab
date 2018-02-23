import java.util.Scanner;

public class AreaCircle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double radius;
		double area;
		
		System.out.print("Enter radius value: ");
		radius = scan.nextDouble();
		area = 2*Math.PI*radius*radius;
	}
}
