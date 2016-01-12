// print characters from 'a' through 'z' recursively.
// not completed
import java.lang.*;

public class q16{
	public static void main(String args[]){
		System.out.println("Printing all alphabets recursively.");
		// int n = 97;
		// System.out.println((char)n);
		recurAlpha(123);
	}

	static String recurAlpha(int n){
		if(n == 97){
			return (char)n + " ";
		}
		else{
			return recurAlpha(n-1);
		}
	}
}