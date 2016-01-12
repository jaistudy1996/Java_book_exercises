// Table of powers from 1-5 using static methods

import java.lang.*;

public class q3{
	public static void main(String args[]){
		System.out.println("A Table of Powers");
		System.out.println("-----------------");
		System.out.printf("%8s%8s%8s %8s%8s\n", "Integer", "Square", "Cube", "Quaratic", "Quintic");
		System.out.printf("%8s%8s%8s %8s%8s\n", "-------", "-------", "-------", "-------", "-------");
		// printing powers for numbers from 1 through 25
		for(int i = 0; i<26; i++){
			System.out.printf("%8s%8s%8s %8s%8s\n", i, square(i), cube(i), quadratic(i), quintic(i));
		}
		System.out.println("Have a great day!");
	}

	static int square(int x){
		return (x * x);
	}

	static int cube(int x){
		return (square(x) * x);
	}

	static int quadratic(int x){
		return (cube(x) * x);
	}

	static int quintic(int x){
		return (quadratic(x) * x);
	}
}