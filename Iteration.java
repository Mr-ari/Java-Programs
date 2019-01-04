public class Iteration{
	public static void main(String[] args) {
		System.out.println("Postfix");
		for(int i=0;i<10;++i) System.out.println(++i);
		System.out.println("Prefix");
		for(int i=0;i<10;i++) System.out.println(i++);	
	}
}