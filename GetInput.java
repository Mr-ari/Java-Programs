import java.util.Scanner;

public class GetInput{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String s = inp.nextLine();
		int a = inp.nextInt();
		float f = inp.nextFloat();
		System.out.println("Your String is = "+s);
		System.out.println("Your Intiger is = "+a);
		System.out.println("Your Float is = "+f);
	}
}