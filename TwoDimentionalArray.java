//Two dimentional array

public class TwoDimentionalArray{
	public static void main(String[] args) {
		int twoD[][] = new int [3][3];
		//3x3 matrix created
		for (int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				twoD[i][j] = (2*i)+j+1;
				System.out.print(twoD[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("----------------------");
		 int arr[][] = new int[4][];
		 arr[0] = new int [1];
		 arr[1] = new int [2];
		 arr[2] = new int [3];
		 arr[3] = new int [4];
		for(int i=0;i<4;i++){
			for(int j=0;j<=i;j++){
				arr[i][j] = (2*i)+j+1;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}