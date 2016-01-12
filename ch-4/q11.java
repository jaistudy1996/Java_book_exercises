// solving F(x) = x^2 - 2
import java.lang.*;

public class q11{
	public static void main(String args[]){
		System.out.println("Finding vales for F(x) = x^2 - 2 ranging from 0 < x < 10 with a step size of 0.01");
		for(double i = 1; i < 10; i += 0.01){
			System.out.println("The value of F(x) is: " + function(i));
		}
	}

	static double function(double x){
		return ((x * x) - 2);
	}
}