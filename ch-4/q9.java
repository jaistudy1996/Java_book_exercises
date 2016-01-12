// random weather predictor
import java.lang.*;
import java.util.*;

public class q9{
	public static void main(String args[]){
		System.out.println("Welcome to weather predictor!");
		System.out.println("Would you like to know today's weather prediction?(y/n)");
		Scanner scan = new Scanner(System.in);
		//String ans = scan.next();
		//System.out.println(scan.hasNext("[n]"));
		while(!scan.hasNext("[n]")){
			double weather =  predict();
			if(weather <= 0.33){
				System.out.println("It will be a rainy day today!");
			}
			if(weather > 0.33 && weather <= 0.67){
				System.out.println("It will be a sunny day today!");
			}
			if(weather > 0.67){
				System.out.println("It will be a cloudy day today!");
			}
			System.out.println("\nWould you like to know another prediction?(y/n)");
			scan.next();
		}
	}

	static double predict(){
		return Math.random();
	}
}