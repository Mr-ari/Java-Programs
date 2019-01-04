public class ArrayPrac{
	public static void main(String[] args) {
		int initializedArr[]={1,2,3,4,5};
		System.out.println("initialized Array");
		for(int i=0;i<5;i++) System.out.print(initializedArr[i]+" ");
		System.out.println();
		int arr[] = new int [10];
		System.out.println("Non initialized Array");
		for(int i=0;i<10;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}