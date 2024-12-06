/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class area_Perimeter
{
    
    static double getRadius(double radius){
        return Math.PI * (radius * radius);
    }
    
    static double getPerimeter(double radius){
        return 2 * Math.PI * radius;
    }
	public static void main(String[] args) {
		System.out.print("Enter radius of circle : ");
        Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println("The area of a circle is : " + area_Perimeter.getRadius(r));
		System.out.println("The area of a perimeter is : " + area_Perimeter.getPerimeter(r));
        sc.close();
	}
}