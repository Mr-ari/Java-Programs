import java.util.Scanner;

class Pattern1{
    public static void main(String[] args) {
        final char ch = '*';
        System.out.println("Enter the value of n : ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        loop1 : for(int i=1;i<=n;i++){
            loop2: for(int j=1;j<=n;j++){
                System.out.print(i+" ");
                if(i == j) break loop2;
            }
            System.out.println();
        }
    }
}