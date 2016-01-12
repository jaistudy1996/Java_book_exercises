// Method overloading using int and double
import java.lang.*;

public class q4{
	public static void main(String args[]){
		System.out.println("Method overloading!!");
		int a = 9, b = 10;
		double c = 9.0, d = 10.0;
		System.out.println("The maximum of " + a + " and " + b + " is:" + max(a, b));
		System.out.println("The maximum of " + c + " and " + d + " is:" + max(c, d));
		// int is promoted to double in the next one.
		System.out.println("The maximum of " + a + " and " + d + " is:" + max(a, d));
	}

	static int max(int x, int y){
		if(x > y){
			return x;
		}
		else{
			return y;
		}
	}

	static double max(double x, double y){
		if(x > y){
			return x;
		}
		else{
			return y;
		}
	}
}