//Box class defined in the Box.java file
public class BoxDemo{
	public static void main(String[] args) {
		Box myBox = new Box();
		myBox.length = 15.23;
		myBox.width = 8.1;
		myBox.height = 88;
		System.out.println("Volume is : "+(myBox.height*myBox.length*myBox.width));
	}
}