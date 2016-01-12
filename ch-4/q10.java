// a fortune telling program
import java.lang.*;

public class q10{
	public static void main(String args[]){
		System.out.println("Welcome to the fortune telling machine!");
		for(int i = 0; i < 10; i++){
			fortune();
		}
	}

	static void fortune(){
		switch((int)(10 * Math.random())){
			case 0:
				System.out.println("fortune - 0");
				break;
			case 1:
				System.out.println("fortune - 1");
				break;
			case 2:
				System.out.println("fortune - 2");
				break;
			case 3:
				System.out.println("fortune - 3");
				break;
			case 4:
				System.out.println("fortune - 4");
				break;
			case 5:
				System.out.println("fortune - 5");
				break;
			case 6:
				System.out.println("fortune - 6");
				break;
			case 7:
				System.out.println("fortune - 7");
				break;
			case 8:
				System.out.println("fortune - 8");
				break;
			case 9:
				System.out.println("fortune - 9");
				break;
			case 10:
				System.out.println("fortune - 10");
				break;
		}
	}
}